package com.dalal.ninja.repositories;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dalal.ninja.models.Ninja;

@Repository
public interface NinjaRepository  extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
//	Page<Ninja> findByPostId(Long dojoId, Pageable pageable);
//	Optional<Ninja> findByIdAndPostId(Long id, Long dojoId);
}
