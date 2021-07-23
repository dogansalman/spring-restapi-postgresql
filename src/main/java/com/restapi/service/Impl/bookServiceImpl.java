package com.restapi.service.Impl;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.restapi.dto.bookDto;
import com.restapi.service.bookService;

import lombok.RequiredArgsConstructor;

import com.restapi.repo.bookRepository;
import com.restapi.entity.book;
import com.restapi.entity.author;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class bookServiceImpl implements bookService {

	private final bookRepository bookRepo;

	@Override
	@Transactional
	public bookDto save(bookDto book) {
		book _book = new book();
		_book.setName(book.getName());
		//_book.setAuthor(book.getAuthor());
		_book.setYear(book.getYear());
		// Kaydedilen entity'nin ID değerini DTO nesnesine set ediyoruz.
		Long id = bookRepo.save(_book).getId();
		book.setId(id);
		return book;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<bookDto> getAll() {
		//List<book> books = bookRepo.findAll();
		List<bookDto> booksList = new ArrayList<>();
		bookRepo.findAll().forEach(b -> {
			bookDto _book = new bookDto();
			_book.setId(b.getId());
			//_book.setAuthor(b.getAuthor());
			_book.setName(b.getName());
			_book.setYear(b.getYear());
			booksList.add(_book);
		});
		return booksList;
	}

	@Override
	public Page<bookDto> getAll(Pageable pageable) {
		return null;
	}

}
