package com.security.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.dao.entity.TrainingInfo;
import com.security.dao.entity.User;
import com.security.service.TrainingService;

@Controller
@RequestMapping("/training")
public class TrainingController {

	@Autowired
	TrainingService trainingService;
	
	@RequestMapping("/currentTraining")
	public String getCurrentTraining(HttpServletRequest request, Model model) {
		List<TrainingInfo> trainingInfos = null;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if(user != null) {
			trainingInfos = trainingService.getCurrentTraining(user.getId());
		}
		model.addAttribute("trainingInfos", trainingInfos);
		return "trainingDetail";
	}
	
	@RequestMapping("/completedTraining")
	public String getCompletedTraining(HttpServletRequest request, Model model) {
		List<TrainingInfo> trainingInfos = null;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if(user != null) {
			trainingInfos = trainingService.getCompletedTraining(user.getId());
		}
		model.addAttribute("trainingInfos", trainingInfos);
		return "trainingDetail";
	}
	
	@RequestMapping("/currentTrainingByMentor")
	public String getCurrentTrainingByMentor(HttpServletRequest request, Model model) {
		List<TrainingInfo> trainingInfos = null;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if(user != null) {
			trainingInfos = trainingService.getCompletedTraining(user.getId());
		}
		model.addAttribute("trainingInfos", trainingInfos);
		return "trainingDetail";
	}
	
	@RequestMapping("/completedTrainingByMentor")
	public String getCompletedTrainingByMentor(HttpServletRequest request, Model model) {
		List<TrainingInfo> trainingInfos = null;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if(user != null) {
			trainingInfos = trainingService.getCompletedTraining(user.getId());
		}
		model.addAttribute("trainingInfos", trainingInfos);
		return "trainingDetail";
	}
	
	@RequestMapping("/pendingTraining")
	public String getPendingTraining(HttpServletRequest request, Model model) {
		List<TrainingInfo> trainingInfos = null;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if(user != null) {
			trainingInfos = trainingService.getPendingTraining(user.getId());
		}
		model.addAttribute("trainingInfos", trainingInfos);
		return "trainingDetail";
	}
	
	@RequestMapping("/pendingTrainingByMentor")
	public String getPendingTrainingByMentor(HttpServletRequest request, Model model) {
		List<TrainingInfo> trainingInfos = null;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if(user != null) {
			trainingInfos = trainingService.getPendingTrainingByMentor(user.getId());
		}
		model.addAttribute("trainingInfos", trainingInfos);
		return "trainingDetail";
	}
}
