package com.pradip.inventory.service;
import java.io.IOException;
import com.pradip.inventory.entity.Product;
import com.pradip.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;
import com.pradip.inventory.exception.ProductNotFoundException;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ImageService imageService;
    public ProductService(ProductRepository productRepository, ImageService imageService) {
        this.productRepository = productRepository;
        this.imageService = imageService;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(
                        "Product not found with id: " + id
                ));
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {

        Product existingProduct = getProductById(id);

        try {
            imageService.deleteImage(existingProduct.getImageName());
        } catch (IOException e) {
            throw new RuntimeException("Failed to delete product image.", e);
        }

        productRepository.delete(existingProduct);
    }

    public Product updateProduct(Long id, Product product) {

        Product existingProduct = getProductById(id);

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());

        return productRepository.save(existingProduct);
    }
}