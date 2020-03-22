package com.security.service;

import java.util.List;

import com.security.dao.entity.MentorCalendar;
import com.security.dao.entity.MentorInfo;

public interface MentorCalendarService {

	MentorCalendar findByUserId(Long userId);
	
	List<MentorInfo> findMentorInfos(String mentorName, String techName, String date_from, String date_to) ;
}
