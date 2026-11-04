package com.erickleo.smartlist.modules.shoppinglist.entity;

import com.erickleo.smartlist.modules.product.entity.ProductEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "shopping_list")
@Entity
public class ShoppingListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Insira o nome da lista.")
    private String name;

    @NotBlank(message = "Insira uma descrição da lista.")
    private String description;

    @NotNull(message = "Insira a data de criação.")
    private LocalDate creationDate;

    @OneToMany(mappedBy = "shoppingListEntity")
    private List<ProductEntity> products;

}