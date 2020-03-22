package com.security.service;

import com.security.dao.entity.Technology;

public interface TechnologyService {

	Technology findByTechName(String name);
	
	void saveTechnology(Technology technology);
}
