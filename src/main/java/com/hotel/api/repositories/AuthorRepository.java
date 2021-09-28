package com.hotel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.api.entities.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer>{

}
