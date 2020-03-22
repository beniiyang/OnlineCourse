package com.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.security.dao.entity.MentorCalendar;
import com.security.dao.entity.MentorInfo;
import com.security.repository.MentorCalendarRepository;
import com.security.service.MentorCalendarService;

@Service("mentorCalendarService")
@Transactional
public class MentorCalendarServiceImpl implements MentorCalendarService {

	@Autowired
	MentorCalendarRepository mentorCalendarRepository;
	
	
	
	@Override
	public MentorCalendar findByUserId(Long userId) {
		
		return mentorCalendarRepository.findByUserId(userId);
	}
	
	public List<MentorInfo> findMentorInfos(String mentor_name, String tech_name, String date_from, String date_to) {
		List<MentorInfo> infos = mentorCalendarRepository.findMentorInfo(mentor_name, tech_name, date_from, date_to);
		return infos;
	}

}
