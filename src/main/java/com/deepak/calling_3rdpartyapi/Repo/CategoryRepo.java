package com.deepak.calling_3rdpartyapi.Repo;

import com.deepak.calling_3rdpartyapi.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {


}
