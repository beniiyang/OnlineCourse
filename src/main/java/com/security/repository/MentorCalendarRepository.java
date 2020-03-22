package com.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.dao.entity.MentorCalendar;
import com.security.dao.entity.MentorInfo;

@Repository
public interface MentorCalendarRepository extends JpaRepository<MentorCalendar, Long> {

	@Query(value = "select * from mentorCalendar where user_id = ?", nativeQuery = true)
	MentorCalendar findByUserId(Long userId);
	
	@Query(value = "select user.user_name, tech.tech_name, calen.start_time, calen.end_time"
			+ " from users user join mentorSkills skill on skill.user_id = user.id "
			+ " join technologies tech on tech.id = skill.tech_id join mentorCalendar calen on calen.user_id = user.id "
			+ " where user.user_name = ?1 and tech.tech_name = ?2 and calen.start_time <= date(?3) and "
			+ " calen.end_time >= date(?4)", nativeQuery = true )
	List<MentorInfo> findMentorInfo(String mentor_name, String tech_name, 
			String date_from,  String date_to);
}
