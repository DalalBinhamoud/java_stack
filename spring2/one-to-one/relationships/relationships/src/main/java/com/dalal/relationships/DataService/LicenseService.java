package com.dalal.relationships.DataService;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalal.relationships.DataRepository.licenseRepository;
import com.dalal.relationships.models.License;
import com.dalal.relationships.models.Person;

@Service

public class LicenseService {
	private final licenseRepository licenseRepository;
	
	
	 
	 public LicenseService(licenseRepository licenseRepository) {
	        this.licenseRepository = licenseRepository;
	    }
	 

	  public void createLicense(License l) {
	       licenseRepository.save(l);
	       l.setNumber("0000"+l.getId());
	       licenseRepository.save(l);
	    }
	 
	  public License findLicense(Long id) {
	        Optional<License> optionalLicense = licenseRepository.findById(id);
	        if(optionalLicense.isPresent()) {
	            return optionalLicense.get();
	        } else {
	            return null;
	        }
	    }
	  
	  
	 
}

	
	
	 

	
