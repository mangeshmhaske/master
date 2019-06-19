package com.cjc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.Model.Student;
import com.cjc.Service.ServiceI;
@Controller
public class HomeController
{
	@Autowired
	ServiceI sr;
 
	@RequestMapping("/")
	public String logincheck()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String registercheck()
	{
		return "register";
	}
	@RequestMapping("/reg")
	public String register(@ModelAttribute Student student)
	{
		int id=sr.saveStud(student);
		if(id>0)
		{
			System.out.println("registration successfull");
			return "login";
		}
		else
		{
			System.out.println("not registered");
			return "register";	
		}
	}
	@RequestMapping("/log")
	public String login(@RequestParam String uname,@RequestParam String password,Model model,@ModelAttribute Student student)
	{
		
		if(uname.equals("admin") && password.equals("admin"))
		{
			System.out.println("single data");
			List<Student> slist=sr.loginall(uname, password);
			model.addAttribute("data", slist);
			return "success";
			
			
		}
		
		if(uname.equals(student.getUname()) && password.equals(student.getPassword()))
		{
			
			
			List<Student> slist=sr.loginch(uname, password);
			model.addAttribute("data", slist);
			return "success";
			
		}
		
		else
		{
			
			System.out.println("enter correct uname and password");
			return "login";
		}
	}
	@RequestMapping("/edit")
	public String edits(@RequestParam int rollno,Model model)
	{
		
		Student st=sr.editStu(rollno);
		model.addAttribute("data", st);
		return "update";
	}
	@RequestMapping("/update")
	public String updateStu(@ModelAttribute Student student,Model model)
	{
		List<Student> slist=sr.updateStu(student);
		model.addAttribute("data", slist);
		return "success";
		
	}
	@RequestMapping("/delete")
	public String deletes(@RequestParam int rollno,Model model)
	{
		System.out.println("inside home");
		List<Student> slist=sr.deleteStu(rollno);
		model.addAttribute("data", slist);
		System.out.println("data sent");
		return "success";
		
	}
	
}
