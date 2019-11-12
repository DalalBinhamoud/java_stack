package com.dalal.relationships.DataRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dalal.relationships.models.License;

@Repository
public interface licenseRepository extends CrudRepository<License, Long> {
	List<License> findAll();
}




