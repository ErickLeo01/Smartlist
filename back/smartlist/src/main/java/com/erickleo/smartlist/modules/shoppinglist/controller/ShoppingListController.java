package com.erickleo.smartlist.modules.shoppinglist.controller;

import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTO;
import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTOResponse;
import com.erickleo.smartlist.modules.shoppinglist.service.ShoppingListCreateUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista")
public class ShoppingListController {

    @Autowired
    private ShoppingListCreateUseCase shoppingListCreateUseCase;

    @PostMapping("/criar")
    public ShoppingListDTOResponse createShoppingList(@Valid @RequestBody ShoppingListDTO shoppingListDTO) {
        return this.shoppingListCreateUseCase.createShoppingList(shoppingListDTO);
    }
}
