package com.erickleo.smartlist.modules.product.controller;

import com.erickleo.smartlist.modules.product.dto.ProductDTO;
import com.erickleo.smartlist.modules.product.dto.ProductDTOResponse;
import com.erickleo.smartlist.modules.product.service.ProductCreateUseCase;
import com.erickleo.smartlist.modules.product.service.ProductDeleteUseCase;
import com.erickleo.smartlist.modules.product.service.ProductFindByIdUseCase;
import com.erickleo.smartlist.modules.product.service.ProductUpdateUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductCreateUseCase  productCreateUseCase;

    @Autowired
    private ProductUpdateUseCase productUpdateUseCase;

    @Autowired
    private ProductDeleteUseCase productDeleteUseCase;

    @Autowired
    private ProductFindByIdUseCase productFindByIdUseCase;

    @PostMapping("/criar")
    public ProductDTOResponse createProduct(@Valid @RequestBody ProductDTO productDTO) {
        return this.productCreateUseCase.createProduct(productDTO);
    }

    @PutMapping("/atualizar/{id}")
    public ProductDTOResponse updateProduct(@PathVariable UUID id, @Valid @RequestBody ProductDTO productDTO) {
        return this.productUpdateUseCase.updateProduct(id, productDTO);
    }

    @DeleteMapping("/deletar/{id}")
    public String deleteProduct(@PathVariable UUID id) {
        return this.productDeleteUseCase.deleteProduct(id);
    }

    @GetMapping("/listar/{id}")
    public ProductDTOResponse listProduct(@PathVariable UUID id) {
        return this.productFindByIdUseCase.findProductById(id);
    }
}
