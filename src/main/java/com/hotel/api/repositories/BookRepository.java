package com.hotel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.api.entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer>{

}
