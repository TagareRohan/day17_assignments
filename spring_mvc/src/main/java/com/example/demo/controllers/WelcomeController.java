package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.entity.Invoice;

@Controller
public class WelcomeController {

	@Autowired
	private Invoice invoice;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String init(Model model)
	{
		model.addAttribute("title", "Kirana Stores");
		return "index";
	}
	
	@RequestMapping(path="/invoice", method=RequestMethod.GET)
	public String initForm(Model model)
	{
		model.addAttribute("command", invoice);
		return "addInvoice";
	}
	
	@RequestMapping(path="/invoice", method=RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") Invoice inv,BindingResult result)
	{
		System.out.println(inv);
		
		if(result.hasErrors())
		{
			return "addInvoice";
		}
		else
		{
			return "success";
		}
		
	}
	
	@ModelAttribute("names")
	public String[] fetchCustomers()
	{
		return new String[] {"ram","sam"};
	}
	
}
