package com.erickleo.smartlist.modules.shoppinglist.repository;

import com.erickleo.smartlist.modules.shoppinglist.entity.ShoppingListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShoppingListRepository extends JpaRepository<ShoppingListEntity, UUID> {
}
