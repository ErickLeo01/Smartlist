package com.erickleo.smartlist.modules.product.repository;

import com.erickleo.smartlist.modules.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
}
