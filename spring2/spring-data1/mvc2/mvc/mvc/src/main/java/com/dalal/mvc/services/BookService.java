package com.dalal.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalal.mvc.models.Book;
import com.dalal.mvc.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
public Book updateBook(Long id,String title,String desc,String lang,Integer numOfPages) {
	   Book upBook = this.findBook(id);
	   
	   upBook.setTitle(title);
	   upBook.setDescription(desc);
	   upBook.setLanguage(lang);
	   upBook.setNumberOfPages(numOfPages);
	   
        return bookRepository.save(upBook);
    }

public Book updateBook(Book b) {
	Book upBook = this.findBook(b.getId());
	 upBook.setTitle(b.getTitle());
	   upBook.setDescription(b.getDescription());
	   upBook.setLanguage(b.getLanguage());
	   upBook.setNumberOfPages(b.getNumberOfPages());
	return bookRepository.save(upBook);
}

public void deleteBook(Long id) {
	bookRepository.deleteById(id);
}
}