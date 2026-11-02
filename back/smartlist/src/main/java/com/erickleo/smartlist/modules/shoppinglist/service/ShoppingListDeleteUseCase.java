package com.erickleo.smartlist.modules.shoppinglist.service;

import com.erickleo.smartlist.modules.shoppinglist.entity.ShoppingListEntity;
import com.erickleo.smartlist.modules.shoppinglist.exception.ShoppingListNotDeleteException;
import com.erickleo.smartlist.modules.shoppinglist.exception.ShoppingListNotUpdateException;
import com.erickleo.smartlist.modules.shoppinglist.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShoppingListDeleteUseCase {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    public String deleteShoppingList(UUID idShoppingList) {

        if (idShoppingList == null) {
            throw new ShoppingListNotDeleteException();
        }

        ShoppingListEntity shoppingListEntity = shoppingListRepository.findById(idShoppingList)
                .orElseThrow(ShoppingListNotDeleteException::new);

        shoppingListRepository.deleteById(idShoppingList);

        return "Lista deletada com sucesso";
    }
}
