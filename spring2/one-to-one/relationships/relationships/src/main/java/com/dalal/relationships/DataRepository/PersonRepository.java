package com.dalal.relationships.DataRepository;


//import java.awt.print.Book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dalal.relationships.models.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();


//	 List<Person> findByDescriptionContaining(String search);
//	 Long countByTitleContaining(String search);
//	 Long deleteByTitleStartingWith(String search);
}



