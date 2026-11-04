package com.erickleo.smartlist.modules.shoppinglist.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ShoppingListDTO(

        String name,

        String description,

        LocalDate creationDate


) {
}
