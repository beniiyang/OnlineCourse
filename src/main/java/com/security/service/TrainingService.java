package com.security.service;

import java.util.List;

import com.security.dao.entity.Training;
import com.security.dao.entity.TrainingInfo;

public interface TrainingService {

	
	void saveTraining(Training training);
	
	List<TrainingInfo> getCurrentTraining(Long userId);
	
	List<TrainingInfo> getCompletedTraining(Long userId);
	
	List<TrainingInfo> getCurrentTrainingByMentor(Long userId);
	
	List<TrainingInfo> getCompletedTrainingByMentor(Long userId);
	
	List<TrainingInfo> getPendingTraining(Long userId);
	
	List<TrainingInfo> getPendingTrainingByMentor(Long userId);
	
}

