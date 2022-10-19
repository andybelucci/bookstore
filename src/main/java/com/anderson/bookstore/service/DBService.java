package com.anderson.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.bookstore.domain.Categoria;
import com.anderson.bookstore.domain.Livro;
import com.anderson.bookstore.repositories.CategoriaRepository;
import com.anderson.bookstore.repositories.LivroRepository;

@Service
public class DBService {

    @Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

    public void instanciaBaseDeDados() {

        Categoria cat1 = new Categoria(null, "Informática", "Livro sobre programação");
		Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Livro Ficção Cientifica");
		Categoria cat3 = new Categoria(null, "Terror", "Livro sobre terror");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Sobre programação", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Sobre criação de um programa", cat1);
		Livro l3 = new Livro(null, "The time machine", "H. G. Wells", "Sobre automação", cat2);
		Livro l4 = new Livro(null, "It", "Stephen King", "Sobre terror", cat2);
		Livro l5 = new Livro(null, "I,m Robot", "Isac Asimov", "Sobre AI", cat2);


		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

	    this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }
    
}
