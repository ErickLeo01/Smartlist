package com.erickleo.smartlist.modules.product.service;

import com.erickleo.smartlist.modules.product.dto.ProductDTO;
import com.erickleo.smartlist.modules.product.dto.ProductDTOResponse;
import com.erickleo.smartlist.modules.product.entity.ProductEntity;
import com.erickleo.smartlist.modules.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCreateUseCase {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTOResponse createProduct(ProductDTO  productDTO) {

        ProductEntity productEntity = new ProductEntity();

        productEntity.setName(productDTO.name());
        productEntity.setQuantity(productDTO.quantity());
        productEntity.setPrice(productDTO.price());
        productEntity.setStatus(productDTO.status());

        ProductEntity saveProduct = productRepository.save(productEntity);

        return new ProductDTOResponse(
                saveProduct.getId(),
                saveProduct.getName(),
                saveProduct.getPrice(),
                saveProduct.getQuantity(),
                saveProduct.isStatus()
        );
    }
}
