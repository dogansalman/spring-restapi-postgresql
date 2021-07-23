package com.restapi.service;
import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.restapi.dto.bookDto;

public interface bookService {

	bookDto save(bookDto book);
	
	void delete(Long id);
	
	List<bookDto> getAll();
	
	Page<bookDto>getAll(Pageable pageable);
}
