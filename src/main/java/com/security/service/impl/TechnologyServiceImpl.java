package com.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.security.dao.entity.Technology;
import com.security.repository.TechnologyRepository;
import com.security.service.TechnologyService;

@Service
@Transactional
public class TechnologyServiceImpl implements TechnologyService{

	@Autowired
	TechnologyRepository technologyRepository;

	@Override
	public Technology findByTechName(String name) {
		return technologyRepository.findByTechName(name);
	}

	@Override
	public void saveTechnology(Technology technology) {
		technologyRepository.save(technology);
		
	}
}
