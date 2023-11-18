package com.students_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import com.students_manager.dao.StudentDao;

import com.students_manager.models.Student;

import com.students_manager.validation.CustomValidator;

@Controller
public class CrudsController {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	CustomValidator cv;

	@RequestMapping(value= { "/", "/students" }, method = RequestMethod.GET)
	public String students_page(ModelMap modelMap) {
		
		modelMap.addAttribute("students", studentDao.read_students());
		
		return "cruds/students";
		
	}
	
	@RequestMapping(value= "/add_student", method = RequestMethod.GET)
	public String add_student_page(ModelMap modelMap) {
		
		modelMap.addAttribute("genders", studentDao.read_genders());
		
		modelMap.addAttribute("countries", studentDao.read_countries());
		
		return "cruds/add_student";
		
	}
	
	@RequestMapping(value= "/add_student", method = RequestMethod.POST)
	public String add_student(Student student, ModelMap modelMap) {
		
		if (
				
			cv.check_full_name(student.getFull_name()) &&
			
			cv.check_age(student.getAge())
			
		) {
			
			studentDao.create_student(student);
			
			return "redirect:students";
			
		} else {
			
			modelMap.addAttribute("student", student);
			
			modelMap.addAttribute("genders", studentDao.read_genders());
			
			modelMap.addAttribute("countries", studentDao.read_countries());
			
			if (!cv.check_full_name(student.getFull_name()))
				
				modelMap.put("full_name_error", "Invalid Full Name!");
			
			if (!cv.check_age(student.getAge()))
				
				modelMap.put("age_error", "Invalid Age!");
			
			return "cruds/add_student";
			
		}
		
	}
	
	@RequestMapping(value= "/update_student", method = RequestMethod.GET)
	public ModelAndView update_student_page(
			
		@RequestParam int primary_student_id
			
	) {
		
		ModelAndView modelAndView = new ModelAndView("cruds/update_student");
		
		modelAndView.addObject(
				
			"student", 
			
			studentDao.get_student_by_id(primary_student_id)
			
		);
		
		modelAndView.addObject("genders", studentDao.read_genders());
		
		modelAndView.addObject("countries", studentDao.read_countries());
		
		return modelAndView;
		
	}
	
	@RequestMapping(value= "/update_student", method = RequestMethod.POST)
	public String update_student(Student student, ModelMap modelMap) {
		
		if (
				
			cv.check_full_name(student.getFull_name()) &&
			
			cv.check_age(student.getAge())
				
		) {
				
			studentDao.update_student_by_id(student);
			
			return "redirect:students";
			
		} else {
			
			modelMap.addAttribute("student", student);
			
			modelMap.addAttribute("genders", studentDao.read_genders());
			
			modelMap.addAttribute("countries", studentDao.read_countries());
			
			if (!cv.check_full_name(student.getFull_name()))
				
				modelMap.put("full_name_error", "Invalid Full Name!");
			
			if (!cv.check_age(student.getAge()))
				
				modelMap.put("age_error", "Invalid Age!");
			
			return "cruds/update_student";
			
		}
		
	}
	
	@RequestMapping(value = "/delete_student", method = RequestMethod.GET)
	public String delete_student(@RequestParam int primary_student_id) {

		studentDao.delete_student_by_id(primary_student_id);
		
		return "redirect:students";
		
	}
	
}
