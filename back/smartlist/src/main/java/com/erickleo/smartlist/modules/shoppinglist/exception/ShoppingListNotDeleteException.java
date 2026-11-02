package com.erickleo.smartlist.modules.shoppinglist.exception;

public class ShoppingListNotDeleteException extends RuntimeException {
    public ShoppingListNotDeleteException() {
        super("Esse ID não existe. Tente novamente");
    }
}
