package com.erickleo.smartlist.modules.product.entity;

import com.erickleo.smartlist.modules.shoppinglist.entity.ShoppingListEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "product")
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Insira o nome do produto.")
    private String name;

    private Integer quantity;

    private Double price;

    @NotNull(message = "Informe se o produto foi comprado ou não.")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "shopping_list_id")
    private ShoppingListEntity shoppingListEntity;

}
