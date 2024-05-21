package com.bookStore;

import com.bookStore.entity.Book;
import com.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreApplication  {

	//@Autowired
	//BookService BookManager;
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {

		Book book0 = new Book((Integer)null, "Le Comte de Monte-Cristo", "par Alexandre Dumas", "85");
		Book book1 = new Book((Integer)null, "Les Fleurs du Mal", "par Charles Baudelaire", "200");
		Book book2 = new Book((Integer)null, "Bel-Ami", "par Guy de Maupassant", "200");
		Book book3 = new Book((Integer)null, "La Nuit", "par Elie Wiesel", "250");
		Book book4 = new Book((Integer)null, "Le Petit Prince", "par Antoine de Saint-Exupéry", "300");
		Book book5 = new Book((Integer)null, "Les Misérables", "par Victor Hugo", "240");
		//Produit produit7 = new Produit((Integer)null, "L'Étranger", "par Albert Camus", 80);
		//Produit produit10 = new Produit((Integer)null, "Madame Bovary", "par Gustave Flaubert", 60.0);
		//Produit produit4 = new Produit((Integer)null, "La Peste", "par Albert Camus", 70.0);
		//Produit produit5 = new Produit((Integer)null, "Germinal", "par Émile Zola", 100.0);
		//Produit produit6 = new Produit((Integer)null, "Candide", "par Voltaire", 150.0);
		this.BookManager.save(book0);
		this.BookManager.save(book1);
		this.BookManager.save(book2);
		this.BookManager.save(book3);
		this.BookManager.save(book4);
		this.BookManager.save(book5);
		//this.produitManager.addProduit(produit6);
		//this.produitManager.addProduit(produit7);
		//this.produitManager.addProduit(produit8);
		//this.produitManager.addProduit(produit9);
		//this.produitManager.addProduit(produit10);
	}

	 */
}
