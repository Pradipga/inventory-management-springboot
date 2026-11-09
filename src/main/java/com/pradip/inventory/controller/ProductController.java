package com.pradip.inventory.controller;

import com.pradip.inventory.entity.Product;
import com.pradip.inventory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.pradip.inventory.service.ImageService;
import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {

    private final ProductService productService;
    private final ImageService imageService;

    public ProductController(
            ProductService productService,
            ImageService imageService) {
        this.productService = productService;
        this.imageService = imageService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@Valid @RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {

        productService.deleteProduct(id);
    }
    @PostMapping("/{id}/image")
    public Product uploadProductImage(
            @PathVariable Long id,
            @RequestParam("image") MultipartFile image) throws java.io.IOException {

        Product product = productService.getProductById(id);

        // Store the old image filename
        String oldImageName = product.getImageName();

        // Upload the new image
        String newImageName = imageService.saveImage(image);

        // Update the product with the new image
        product.setImageName(newImageName);

        Product updatedProduct = productService.saveProduct(product);

        // Delete the old image after successful database update
        if (oldImageName != null && !oldImageName.isBlank()) {
            imageService.deleteImage(oldImageName);
        }

        return updatedProduct;
    }
}