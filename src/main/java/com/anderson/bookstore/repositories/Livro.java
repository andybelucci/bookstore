package com.anderson.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Livro extends JpaRepository<com.anderson.bookstore.domain.Livro, Integer>{
    
}
