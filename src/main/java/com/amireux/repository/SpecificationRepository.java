package com.amireux.repository;

import com.amireux.model.Product;
import com.amireux.model.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpecificationRepository extends JpaRepository<Specification, Long> {
    List<Specification> findAllByProduct(Product product);
}
