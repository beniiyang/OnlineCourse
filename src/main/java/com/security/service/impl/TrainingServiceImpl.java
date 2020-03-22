package com.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.security.dao.entity.Training;
import com.security.dao.entity.TrainingInfo;
import com.security.repository.TrainingRepository;
import com.security.service.TrainingService;

@Service
@Transactional
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	TrainingRepository trainingRepository;

	@Override
	public void saveTraining(Training training) {
		trainingRepository.save(training);

	}
	
	public List<TrainingInfo> getCurrentTraining(Long userId) {
		List<TrainingInfo> trainingInfos = trainingRepository.getCurrentTraining(userId);
		return trainingInfos;
	}
	
	public List<TrainingInfo> getCompletedTraining(Long userId) {
		List<TrainingInfo> trainingInfos = trainingRepository.getCompletedTraining(userId);
		return trainingInfos;
	}
	
	public List<TrainingInfo> getCurrentTrainingByMentor(Long userId) {
		List<TrainingInfo> trainingInfos = trainingRepository.getCurrentTraining(userId);
		return trainingInfos;
	}
	
	public List<TrainingInfo> getCompletedTrainingByMentor(Long userId) {
		List<TrainingInfo> trainingInfos = trainingRepository.getCompletedTraining(userId);
		return trainingInfos;
	}
	
	public List<TrainingInfo> getPendingTraining(Long userId) {
		List<TrainingInfo> trainingInfos = trainingRepository.getPendingTraining(userId);
		return trainingInfos;
	}
	
	public List<TrainingInfo> getPendingTrainingByMentor(Long userId) {
		List<TrainingInfo> trainingInfos = trainingRepository.getPendingTrainingByMentor(userId);
		return trainingInfos;
	}

}
