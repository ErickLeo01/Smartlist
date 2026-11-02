package com.erickleo.smartlist.modules.shoppinglist.exception;

public class ShoppingListNotUpdateException extends RuntimeException {
    public ShoppingListNotUpdateException() {
        super("Não é possível atualizar a lista.");
    }
}
