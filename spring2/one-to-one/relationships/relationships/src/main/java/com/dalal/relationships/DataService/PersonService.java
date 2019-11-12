package com.dalal.relationships.DataService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalal.relationships.DataRepository.PersonRepository;
import com.dalal.relationships.models.Person;
@Service
public class PersonService {
	 private final PersonRepository personRepository;
	 
	 
	 public PersonService(PersonRepository personRepository) {
	        this.personRepository = personRepository;
	    }
	 
	  public List<Person> allPersons() {
	        return personRepository.findAll();
	    }
	  
	  public Person createPerson(Person p) {
	        return personRepository.save(p);
	    }
	 
	  public Person findPerson(Long id) {
	        Optional<Person> optionalPerson = personRepository.findById(id);
	        if(optionalPerson.isPresent()) {
	            return optionalPerson.get();
	        } else {
	            return null;
	        }
	    }
}



    