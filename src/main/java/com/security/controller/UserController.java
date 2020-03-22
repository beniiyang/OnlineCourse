package com.security.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.security.dao.entity.MentorInfo;
import com.security.dao.entity.User;
import com.security.service.MentorCalendarService;
import com.security.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Qualifier("mentorCalendarService")
	@Autowired
	MentorCalendarService mentorCalendarService;


	
	@RequestMapping("/register")
	public String saveUser(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
		String name = user.getUseName();
		String password = user.getPassword();
		//userService.saveUser(user);
		System.out.println("Name is "+name + ", Password is "+password);
		
		return "forward:/user/forwardTarget?name="+name;
	}
	
	@RequestMapping("/forwardTarget")
    public String forwardTarget(Model model, @RequestParam("name") String name) {
		model.addAttribute("userName", name);
        return "user";
    }
	
	@RequestMapping("/login")
	public String getUser(HttpServletRequest request, @RequestParam("username") String name, @RequestParam("password") String password) {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(session.getId());
		if (user == null) {
			user = userService.loginUser(name, password);
			if(user == null ) {
				return "login";
			} 
			session.setAttribute(session.getId(), user);
		} else {
			if (!name.equalsIgnoreCase(user.getUseName()) || !password.equalsIgnoreCase(user.getPassword())) {
				return "login";
			}
		}
		
		if("user".equalsIgnoreCase(user.getUserRole())) {
			return "user";
		} else if("mentor".equalsIgnoreCase(user.getUserRole())){
			return "mentor";
		}
		return null;
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("mentor_name") String mentor_name, @RequestParam("tech_name") String tech_name, 
			@RequestParam("date_from") String date_from, @RequestParam("date_to") String date_to, Model model) {
		List<MentorInfo> infos = mentorCalendarService.findMentorInfos(mentor_name, tech_name, date_from, date_to);
		if(infos.isEmpty()) {
			//SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
			//String date = sdf.format(new Date());
			
			
			MentorInfo info1 = new MentorInfo();
			info1.setTechName("Java");
			info1.setMentorName("Ben");
			info1.setCourseStartDate(new Date());
			info1.setCourseEndDate(new Date());
			
			MentorInfo info2 = new MentorInfo();
			info2.setTechName("Srping");
			info2.setMentorName("Bill");
			info2.setCourseStartDate(new Date());
			info2.setCourseEndDate(new Date());
			
			infos.add(info1);
			infos.add(info2);
		}
		model.addAttribute("infos", infos);
		return "home";
	}
}
