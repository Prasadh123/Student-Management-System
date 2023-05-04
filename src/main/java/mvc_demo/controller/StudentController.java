package mvc_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc_demo.dao.StudentDAO;
import mvc_demo.dto.Student;

@Controller
public class StudentController {

	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("student",new Student());
		mav.setViewName("saveStudent.jsp");
		return mav;
	}
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student student) {
		dao.saveStudent(student);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
		
	}
	@RequestMapping("/viewStudents")
	public ModelAndView viewStudents() {
		List<Student> students=dao.getAllStudents();
		ModelAndView mav=new ModelAndView("viewStudents.jsp");
		mav.addObject("students",students);
		return mav;
	
	}
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("updateStudent.jsp");
		Student student=dao.getStudent(id);
		mav.addObject("student",student);
		return mav;
	}
	@RequestMapping("/saveUpdatedStudent")
	public ModelAndView saveUpdatedStudent(@ModelAttribute Student student) {
		ModelAndView mav=new ModelAndView("viewStudents.jsp");
		dao.updateStudent(student);
		mav.addObject("students",dao.getAllStudents());
		return mav;
	}
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("viewStudents.jsp");
		dao.deleteStudent(id);
		mav.addObject("students",dao.getAllStudents());
		return mav;
		
	}
}
