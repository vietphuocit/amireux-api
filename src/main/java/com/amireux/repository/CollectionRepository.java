package com.amireux.repository;

import com.amireux.model.Collection;
import com.amireux.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CollectionRepository extends JpaRepository<Collection, Long> {
    Collection findByName(String name);

    List<Collection> findAllByOrderByIdAsc();

    @Transactional
    @Modifying
    @Query("update Collection c set c.name = :collectionName, c.image = :image where c.id = :idCollection")
    void updateCollection(Long idCollection, String collectionName, Image image);
}
