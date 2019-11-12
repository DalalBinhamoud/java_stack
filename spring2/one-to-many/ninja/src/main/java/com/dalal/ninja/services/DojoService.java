package com.dalal.ninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalal.ninja.models.Dojo;
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
}
