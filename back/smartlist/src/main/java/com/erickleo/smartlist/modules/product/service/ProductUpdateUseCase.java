package com.erickleo.smartlist.modules.product.service;

import com.erickleo.smartlist.modules.product.dto.ProductDTO;
import com.erickleo.smartlist.modules.product.dto.ProductDTOResponse;
import com.erickleo.smartlist.modules.product.entity.ProductEntity;
import com.erickleo.smartlist.modules.product.exception.ProductIdNotFoundException;
import com.erickleo.smartlist.modules.product.exception.ProductNotUpdateException;
import com.erickleo.smartlist.modules.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductUpdateUseCase {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTOResponse updateProduct(UUID idProduct, ProductDTO productDTO) {

        if (idProduct == null || productDTO == null) {
            throw new ProductNotUpdateException();
        }

        ProductEntity productEntity = productRepository.findById(idProduct)
                .orElseThrow(ProductIdNotFoundException::new);

        if (productDTO.name() != null) {
            productEntity.setName(productDTO.name());
        }

        if (productDTO.price() != null) {
            productEntity.setPrice(productDTO.price());
        }

        if (productDTO.quantity() != null) {
            productEntity.setQuantity(productDTO.quantity());
        }

        if (productDTO.status() != null) {
            productEntity.setStatus(productDTO.status());
        }

        ProductEntity updatedProductEntity = productRepository.save(productEntity);

        return new ProductDTOResponse(
                updatedProductEntity.getId(),
                updatedProductEntity.getName(),
                updatedProductEntity.getPrice(),
                updatedProductEntity.getQuantity(),
                updatedProductEntity.isStatus()
        );

    }
}
