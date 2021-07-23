package com.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.entity.book;

public interface bookRepository extends JpaRepository<book, Long> {

}
