package com.erickleo.smartlist.modules.product.controller;

import com.erickleo.smartlist.modules.product.dto.ProductDTO;
import com.erickleo.smartlist.modules.product.dto.ProductDTOResponse;
import com.erickleo.smartlist.modules.product.service.ProductCreateUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProductController {

    @Autowired
    private ProductCreateUseCase  productCreateUseCase;

    @PostMapping("/criar")
    public ProductDTOResponse createProduct(@Valid @RequestBody ProductDTO productDTO) {
        return this.productCreateUseCase.createProduct(productDTO);
    }
}
