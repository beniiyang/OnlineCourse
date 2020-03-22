package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.dao.entity.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long>{

	@Query(value = "select * from technologies where tech_name = ?", nativeQuery = true)
	Technology findByTechName(String name);
	
}
