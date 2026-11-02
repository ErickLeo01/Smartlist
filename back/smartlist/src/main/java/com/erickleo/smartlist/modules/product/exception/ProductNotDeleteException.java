package com.erickleo.smartlist.modules.product.exception;

public class ProductNotDeleteException extends RuntimeException {
    public ProductNotDeleteException() {
        super("Não foi possível deletar a lista.");
    }
}
