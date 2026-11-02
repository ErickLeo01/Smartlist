package com.erickleo.smartlist.modules.shoppinglist.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ShoppingListDTO(

        @NotBlank(message = "Insira um nome.")
        String name,

        @NotBlank(message = "Insira uma descrição.")
        String description,

        @NotNull(message = "Insira a data de criação.")
        LocalDate creationDate


) {
}
