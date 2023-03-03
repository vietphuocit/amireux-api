package com.amireux.repository;

import com.amireux.model.Image;
import com.amireux.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findAllByProduct(Product product);
    Image findByName(String name);

    @Transactional
    @Modifying
    @Query("update Image i set i.product = :product where i.id = :idImage")
    void updateImage(Long idImage, Product product);
}
