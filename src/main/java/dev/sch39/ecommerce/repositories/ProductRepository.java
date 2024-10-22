package dev.sch39.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.sch39.ecommerce.entities.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
  @Query(value = "select * from products where slug=?1 and is_deleted=false", nativeQuery = true)
  Optional<ProductEntity> findBySlug(String slug);
}
