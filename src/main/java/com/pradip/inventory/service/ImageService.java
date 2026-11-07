
package com.pradip.inventory.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Set;
import java.util.UUID;

@Service
public class ImageService {

    private final Path uploadDirectory =
            Paths.get("uploads").toAbsolutePath().normalize();

    private static final long MAX_FILE_SIZE = 5 * 1024 * 1024;

    private static final Set<String> ALLOWED_TYPES = Set.of(
            "image/jpeg",
            "image/png",
            "image/webp",
            "image/gif"
    );

    public String saveImage(MultipartFile file) throws IOException {

        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("Please select an image.");
        }

        if (file.getSize() > MAX_FILE_SIZE) {
            throw new IllegalArgumentException(
                    "Image size must not exceed 5 MB."
            );
        }

        if (!ALLOWED_TYPES.contains(file.getContentType())) {
            throw new IllegalArgumentException(
                    "Only JPG, PNG, WEBP, and GIF images are allowed."
            );
        }

        Files.createDirectories(uploadDirectory);

        String originalName = file.getOriginalFilename();
        String extension = "";

        if (originalName != null && originalName.lastIndexOf('.') >= 0) {
            extension = originalName.substring(
                    originalName.lastIndexOf('.')
            ).toLowerCase();
        }

        String fileName = UUID.randomUUID() + extension;
        Path destination = uploadDirectory.resolve(fileName).normalize();

        if (!destination.getParent().equals(uploadDirectory)) {
            throw new IllegalArgumentException("Invalid image filename.");
        }

        Files.copy(
                file.getInputStream(),
                destination,
                StandardCopyOption.REPLACE_EXISTING
        );

        return fileName;
    }
    public void deleteImage(String fileName) throws IOException {

        if (fileName == null || fileName.isBlank()) {
            return;
        }

        Path imagePath = uploadDirectory.resolve(fileName).normalize();

        if (!imagePath.getParent().equals(uploadDirectory)) {
            throw new IllegalArgumentException("Invalid image filename.");
        }

        Files.deleteIfExists(imagePath);
    }
}
