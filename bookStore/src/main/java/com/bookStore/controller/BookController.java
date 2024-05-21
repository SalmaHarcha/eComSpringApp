package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Book;
import com.bookStore.entity.Panier;
import com.bookStore.service.BookService;
import com.bookStore.service.PanierService;

import java.util.*;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private PanierService myBookService;

	@GetMapping("/")
	public String home(Authentication authentication) {
		if (authentication != null && authentication.getAuthorities().stream()
				.anyMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN"))) {
			return "redirect:/homeadmin";
		}
		return "home";
	}
	@GetMapping("/homeadmin")
	public String homeadmin() {
		return "homeadmin";
	}


	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}

	@GetMapping("/available_books")
	public ModelAndView getAllBook(Authentication authentication) {
		List<Book> list = service.getAllBook();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("book", list);

		if (authentication != null && authentication.getAuthorities().stream()
				.anyMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN"))) {
			modelAndView.setViewName("bookListAdmin");
		} else {
			modelAndView.setViewName("bookList");
		}

		return modelAndView;
	}



	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/available_books";
	}
	@GetMapping("/my_books")
	public String getMyBooks(Model model)
	{
		List<Panier>list=myBookService.getAllMyBooks();
		model.addAttribute("book",list);
		return "panier";
	}
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book b=service.getBookById(id);
		Panier mb=new Panier(b.getId(),b.getName(),b.getAuthor(),b.getPrice(),b.getImage());
		myBookService.saveMyBooks(mb);
		return "redirect:/my_books";
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id,Model model) {
		Book b=service.getBookById(id);
		model.addAttribute("book",b);
		return "bookEdit";
	}
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/available_books";
	}
	@GetMapping("/book_details/{id}")
	public String bookDetails(@PathVariable("id") int id, Model model) {
		Book b = service.getBookById(id);
		model.addAttribute("book", b);
		return "bookdetails";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/logout")
	public String logout() {
		return "redirect:/";
	}
}
