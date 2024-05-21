package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Panier;
import com.bookStore.repository.PanierRepository;

@Service
public class PanierService {
	
	@Autowired
	private PanierRepository mybook;
	
	public void saveMyBooks(Panier book) {
		mybook.save(book);
	}
	
	public List<Panier> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
