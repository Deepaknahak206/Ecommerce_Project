package com.deepak.calling_3rdpartyapi.Repo;

import com.deepak.calling_3rdpartyapi.Models.Product;
import jdk.jfr.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    @Override
    Optional<Product> findById(Long aLong);

    Optional<Product> findByTitle (String title) ;
    // List doesn't through null values so we don't write optional
    List<Product> findByTitleAndDescription(String title, String description) ;
    Product save(Product product);

}

