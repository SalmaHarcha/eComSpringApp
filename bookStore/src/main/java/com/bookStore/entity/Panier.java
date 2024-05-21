package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBooks")
public class Panier {
	
	@Id
	private int id;
	private String name;
	private String author;
	private String price;
	private String image;
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panier(int id, String name, String author, String price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() { return image;}
	public void setImage(String image) { this.image = image;}
}
