package com.erickleo.smartlist.modules.shoppinglist.controller;

import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTO;
import com.erickleo.smartlist.modules.shoppinglist.dto.ShoppingListDTOResponse;
import com.erickleo.smartlist.modules.shoppinglist.service.ShoppingListCreateUseCase;
import com.erickleo.smartlist.modules.shoppinglist.service.ShoppingListDeleteUseCase;
import com.erickleo.smartlist.modules.shoppinglist.service.ShoppingListFindByIdUseCase;
import com.erickleo.smartlist.modules.shoppinglist.service.ShoppingListUpdateUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/lista")
@CrossOrigin(origins = "http://localhost:4200")
public class ShoppingListController {

    @Autowired
    private ShoppingListCreateUseCase shoppingListCreateUseCase;

    @Autowired
    private ShoppingListUpdateUseCase shoppingListUpdateUseCase;

    @Autowired
    private ShoppingListDeleteUseCase shoppingListDeleteUseCase;

    @Autowired
    private ShoppingListFindByIdUseCase shoppingListFindByIdUseCase;

    @PostMapping("/criar")
    public ShoppingListDTOResponse createShoppingList(@Valid @RequestBody ShoppingListDTO shoppingListDTO) {
        return this.shoppingListCreateUseCase.createShoppingList(shoppingListDTO);
    }

    @PutMapping("/atualizar/{id}")
    public ShoppingListDTOResponse updateShoppingList(@PathVariable UUID id, @Valid @RequestBody ShoppingListDTO shoppingListDTO) {
        return this.shoppingListUpdateUseCase.updateShoppingList(id, shoppingListDTO);
    }

    @DeleteMapping("/deletar/{id}")
    public String deleteShoppingList(@PathVariable UUID id) {
        return this.shoppingListDeleteUseCase.deleteShoppingList(id);
    }

    @GetMapping("/listar/{id}")
    public ShoppingListDTOResponse getShoppingList(@PathVariable UUID id) {
        return this.shoppingListFindByIdUseCase.findShoppingListById(id);
    }
}
