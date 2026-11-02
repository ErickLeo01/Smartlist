package com.erickleo.smartlist.modules.product.dto;

import java.util.UUID;

public record ProductDTOResponse(UUID id, String name, Double price, Integer quantity, boolean status) {
    }
