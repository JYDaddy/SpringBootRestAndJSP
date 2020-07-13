package com.chandler.rest.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandler.rest.domain.Book;
import com.chandler.rest.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getBookList() {
		
		return bookRepository.findAll();
	}

	public Optional<Book> getBookOne(Long id) {
		Optional<Book> book = bookRepository.findById(id);
		return book;
	}

	@Transactional
	public void regBook(Book book) {

		bookRepository.save(book);
	}

	@Transactional
	public Book modiBook(Book book) {
		return bookRepository.save(book);
	}

	@Transactional
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}
}
