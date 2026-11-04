package com.erickleo.smartlist.modules.product.service;

import com.erickleo.smartlist.modules.product.dto.ProductDTO;
import com.erickleo.smartlist.modules.product.dto.ProductDTOResponse;
import com.erickleo.smartlist.modules.product.entity.ProductEntity;
import com.erickleo.smartlist.modules.product.exception.ProductIdNotFoundException;
import com.erickleo.smartlist.modules.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductFindByIdUseCase {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTOResponse findProductById(UUID idProduct) {

        if (idProduct == null) {
            throw new ProductIdNotFoundException();
        }

        ProductEntity productEntity = productRepository.findById(idProduct)
                .orElseThrow(ProductIdNotFoundException::new);

        return new ProductDTOResponse(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getPrice(),
                productEntity.getQuantity(),
                productEntity.isStatus()
        );
    }
}
