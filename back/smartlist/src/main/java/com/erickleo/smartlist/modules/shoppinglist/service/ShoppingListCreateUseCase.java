package com.erickleo.smartlist.modules.shoppinglist.service;

import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTO;
import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTOResponse;
import com.erickleo.smartlist.modules.shoppinglist.entity.ShoppingListEntity;
import com.erickleo.smartlist.modules.shoppinglist.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingListCreateUseCase {

    @Autowired
    private ShoppingListRepository shoppingListRepository;


    public ShoppingListDTOResponse createShoppingList(ShoppingListDTO  shoppingListDTO) {
        ShoppingListEntity  shoppingListEntity = new ShoppingListEntity();

        shoppingListEntity.setName(shoppingListDTO.name());
        shoppingListEntity.setDescription(shoppingListDTO.description());
        shoppingListEntity.setCreationDate(shoppingListDTO.creationDate());

        ShoppingListEntity saveShoppingList = shoppingListRepository.save(shoppingListEntity);

        return new ShoppingListDTOResponse(
                saveShoppingList.getId(),
                saveShoppingList.getName(),
                saveShoppingList.getDescription(),
                saveShoppingList.getCreationDate()
        );
    }
}
