package com.erickleo.smartlist.modules.product.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductDTO(

        @NotBlank(message = "Insira o nome do produto.")
        String name,

        Integer quantity,

        Double price,

        @NotBlank(message = "Informe se o produto foi comprado ou não. ")
        Boolean status
) {
}
