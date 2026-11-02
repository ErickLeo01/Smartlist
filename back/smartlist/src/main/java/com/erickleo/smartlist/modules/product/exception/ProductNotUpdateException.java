package com.erickleo.smartlist.modules.product.exception;

public class ProductNotUpdateException extends RuntimeException {
    public ProductNotUpdateException() {
        super("Não é possível atualizar a lista.");
    }
}
