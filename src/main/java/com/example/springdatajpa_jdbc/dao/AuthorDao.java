package com.example.springdatajpa_jdbc.dao;

import com.example.springdatajpa_jdbc.domain.Author;

public interface AuthorDao {
	Author getById(Long id);
	Author findAuthorByName(String firstName, String lastName);
	Author saveNewAuthor(Author author);
	Author updateAuthor(Author author);
	void deleteAuthorById(Long id);
}
