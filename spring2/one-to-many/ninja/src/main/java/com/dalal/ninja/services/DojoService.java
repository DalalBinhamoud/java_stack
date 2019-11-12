package com.dalal.ninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalal.ninja.models.Dojo;
import com.dalal.ninja.models.Ninja;
import com.dalal.ninja.repositories.DojoRepository;

@Service
public class DojoService {
	 private final DojoRepository dojoRepository;
	 
	    public DojoService(DojoRepository dojoRepository) {
	        this.dojoRepository = dojoRepository;
	    }
	    
	    public void createDojo(Dojo d) {
	    	dojoRepository.save(d);
	    }
	    
	    public List<Dojo> allDojos() {
	        return dojoRepository.findAll();
	    }
	    
	    public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public void test() {
	    	List<Object[]> dojos = dojoRepository.findAllDojosNamesWithId2();
	    	Object[] dojo = dojos.get(0);
	    	Object dojoId = dojo[0];
	    	Object dojoName = dojo[1];
	    	
	    	List<Object[]> table = dojoRepository.joinDojosAndNinjas2();
	    	for(Object[] row : table) {
	    	    Dojo dojo2 = (Dojo) row[0];
	    	    Ninja ninja = (Ninja) row[1];
	    	    System.out.println("dalal first test");
	    	    System.out.println(dojo2.getName());
	    	    System.out.println(ninja.getFirstName());
	    	}
	    	
	    	System.out.print("dalal will test"+ dojoName );
	    	
	    }
}
