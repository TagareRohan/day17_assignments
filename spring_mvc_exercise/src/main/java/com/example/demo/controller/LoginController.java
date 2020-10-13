package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.User;

@Controller
public class LoginController {


	private List<User> userList;
	
	@Autowired
	private User user;
	
	public LoginController()
	{
		userList=new ArrayList<>();
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String init(Model model)
	{
		model.addAttribute("title", "Hello");
		return "index";
	}
	
	@RequestMapping(path="/index",method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("title","Hello");
		return "index";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String loginForm(Model model)
	{
		model.addAttribute("command",user);
		return "login";
	}
	
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String registerForm(Model model)
	{
		model.addAttribute("command", user);
		return "register";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String onLogin(@ModelAttribute("command") User user )
	{
		System.out.println(user);
		
		
		
			String userName=user.getUserName();
			String password=user.getPassword();
			
			
			for(User use: userList)
			{
				if(use.getUserName().equals(userName) && use.getPassword().equals(password))
				{
					return "success";
				}
				
			}
			
			return "login";
		
		
		
		
	}
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String onRegister(@Valid @ModelAttribute("command") User user,BindingResult result)
	{
		System.out.println(user);
		
		
		
		if(result.hasErrors())
		{
			return "register";
		}
		else
		{
			
			userList.add(user);
			return "success";
		}
	}
	
	
}
