package com.erickleo.smartlist.modules.product.exception;

public class ProductIdNotFoundException extends RuntimeException {
    public ProductIdNotFoundException() {
        super("Esse ID não existe. Tente novamente");
    }
}
