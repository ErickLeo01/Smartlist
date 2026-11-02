package com.erickleo.smartlist.modules.shoppinglist.service;

import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTO;
import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTOResponse;
import com.erickleo.smartlist.modules.shoppinglist.entity.ShoppingListEntity;
import com.erickleo.smartlist.modules.shoppinglist.exception.ShoppingListNotUpdateException;
import com.erickleo.smartlist.modules.shoppinglist.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShoppingListUpdateUseCase {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    public ShoppingListDTOResponse updateShoppingList(UUID idShoppingList, ShoppingListDTO shoppingListDTO) {

        if (idShoppingList == null || shoppingListDTO == null) {
            throw new ShoppingListNotUpdateException();
        }


        // Verifica se o ID existe no banco. Se não existir, vai lançar uma exceção.
        ShoppingListEntity  shoppingListEntity = shoppingListRepository.findById(idShoppingList)
                .orElseThrow(ShoppingListNotUpdateException::new);

        if (shoppingListDTO.name() != null) {
            shoppingListEntity.setName(shoppingListDTO.name());
        }

        if (shoppingListDTO.description() != null) {
            shoppingListEntity.setDescription(shoppingListDTO.description());
        }

        if (shoppingListDTO.creationDate() != null) {
            shoppingListEntity.setCreationDate(shoppingListDTO.creationDate());
        }

        ShoppingListEntity savedShoppingList = shoppingListRepository.save(shoppingListEntity);

        return new ShoppingListDTOResponse(
                savedShoppingList.getId(),
                savedShoppingList.getName(),
                savedShoppingList.getDescription(),
                savedShoppingList.getCreationDate()
        );
    }
}