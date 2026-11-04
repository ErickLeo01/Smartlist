package com.erickleo.smartlist.modules.shoppinglist.service;

import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTO;
import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTOResponse;
import com.erickleo.smartlist.modules.shoppinglist.entity.ShoppingListEntity;
import com.erickleo.smartlist.modules.shoppinglist.exception.ShoppingListIdNotFoundException;
import com.erickleo.smartlist.modules.shoppinglist.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShoppingListFindByIdUseCase {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    public ShoppingListDTOResponse findShoppingListById(UUID idShoppingList){

        if (idShoppingList == null) {
            throw new ShoppingListIdNotFoundException();
        }

        ShoppingListEntity shoppingListEntity = shoppingListRepository.findById(idShoppingList)
                .orElseThrow(ShoppingListIdNotFoundException::new);

        return new ShoppingListDTOResponse(
               shoppingListEntity.getId(),
               shoppingListEntity.getName(),
               shoppingListEntity.getDescription(),
               shoppingListEntity.getCreationDate()
        );
    }
}
