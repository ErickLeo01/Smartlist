package com.erickleo.smartlist.modules.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(

        String name,

        Integer quantity,

        Double price,

        boolean status
) {
}
