package com.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.dao.entity.Training;
import com.security.dao.entity.TrainingInfo;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {

	@Query(value = "select user.user_name, tech.tech_name,  calen.start_time, calen.end_time, tr.training_status "
			+ " from trainings tr join technologies tech on tech.id = tr.tech_id join user user on user.id = tr.mentor_user_id "
			+ " join mentorCalendar calen on calen.user_id = user.id "
			+ "where tr.user_id = ? and tr.training_status = 'In Progress' ", nativeQuery = true)
	List<TrainingInfo> getCurrentTraining(Long userId);
	
	@Query(value = "select user.user_name, tech.tech_name,  calen.start_time, calen.end_time, tr.training_status "
			+ " from trainings tr join technologies tech on tech.id = tr.tech_id join user user on user.id = tr.mentor_user_id "
			+ " join mentorCalendar calen on calen.user_id = user.id "
			+ "where tr.user_id = ? and tr.training_status = 'Completed' ", nativeQuery = true)
	List<TrainingInfo> getCompletedTraining(Long userId);
	
	@Query(value = "select user.user_name, tech.tech_name,  calen.start_time, calen.end_time, tr.training_status "
			+ " from trainings tr join technologies tech on tech.id = tr.tech_id join user user on user.id = tr.user_id "
			+ " join mentorCalendar calen on calen.user_id = user.id "
			+ "where tr.mentor_user_id = ? and tr.training_status = 'In Progress' ", nativeQuery = true)
	List<TrainingInfo> getCurrentTrainingByMentor(Long userId);
	
	@Query(value = "select user.user_name, tech.tech_name,  calen.start_time, calen.end_time, tr.training_status "
			+ " from trainings tr join technologies tech on tech.id = tr.tech_id join user user on user.id = tr.user_id "
			+ " join mentorCalendar calen on calen.user_id = user.id "
			+ "where tr.mentor_user_id = ? and tr.training_status = 'Completed' ", nativeQuery = true)
	List<TrainingInfo> getCompletedTrainingByMentor(Long userId);
	
	@Query(value = "select user.user_name, tech.tech_name,  calen.start_time, calen.end_time, tr.training_status "
			+ " from trainings tr join technologies tech on tech.id = tr.tech_id join user user on user.id = tr.mentor_user_id "
			+ " join mentorCalendar calen on calen.user_id = user.id "
			+ "where tr.user_id = ? and tr.training_status in ( 'Pending', 'Reject' )", nativeQuery = true)
	List<TrainingInfo> getPendingTraining(Long userId);
	
	@Query(value = "select user.user_name, tech.tech_name,  calen.start_time, calen.end_time, tr.training_status "
			+ " from trainings tr join technologies tech on tech.id = tr.tech_id join user user on user.id = tr.user_id "
			+ " join mentorCalendar calen on calen.user_id = user.id "
			+ "where tr.mentor_user_id = ? and tr.training_status in ( 'Pending', 'Reject' ) ", nativeQuery = true)
	List<TrainingInfo> getPendingTrainingByMentor(Long userId);
	
}
