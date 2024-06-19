package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Autowired
	private BookMapper bookMapper;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookMapper.getAllBooks();
	}
}