package com.hotel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.api.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{

}
