package com.dalal.ninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalal.ninja.models.Ninja;
import com.dalal.ninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	 private final NinjaRepository ninjaRepository;
	 
	    public NinjaService(NinjaRepository ninjaRepository) {
	        this.ninjaRepository = ninjaRepository;
	    }
	    
	    public void createNinja(Ninja n) {
	    	ninjaRepository.save(n);
	    }
	    
	    public List<Ninja> allNinjas() {
	        return ninjaRepository.findAll();
	    }
	    
	    public Ninja NinjasforDojo(Long id) {
	        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }

}


