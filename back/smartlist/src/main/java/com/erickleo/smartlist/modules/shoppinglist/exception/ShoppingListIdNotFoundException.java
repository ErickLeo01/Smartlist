package com.erickleo.smartlist.modules.shoppinglist.exception;

public class ShoppingListIdNotFoundException extends RuntimeException {
    public ShoppingListIdNotFoundException() {
        super("Esse ID não existe. Tente novamente");
    }
}
