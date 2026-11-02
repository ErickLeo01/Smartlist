package com.erickleo.smartlist.modules.product.service;

import com.erickleo.smartlist.modules.product.entity.ProductEntity;
import com.erickleo.smartlist.modules.product.exception.ProductIdNotFoundException;
import com.erickleo.smartlist.modules.product.exception.ProductNotDeleteException;
import com.erickleo.smartlist.modules.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductDeleteUseCase {

    @Autowired
    private ProductRepository productRepository;

    public String deleteProduct(UUID idProduct) {

        if (idProduct == null) {
            throw new ProductNotDeleteException();
        }

        ProductEntity productEntity = productRepository.findById(idProduct)
                .orElseThrow(ProductIdNotFoundException::new);

         productRepository.deleteById(idProduct);

        return "Produto deletado com sucesso";
    }
}
