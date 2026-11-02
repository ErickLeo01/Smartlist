package com.erickleo.smartlist.modules.shoppinglist.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

public record ShoppingListDTOResponse(UUID id, String name, String description, LocalDate creationDate
) {
}
