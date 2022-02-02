package com.PlacmentManagmentSystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.PlacmentManagmentSystem.Entity.Company;
import com.PlacmentManagmentSystem.Service.CompanyService;


@Controller
	public class CompanyController {
	      @Autowired
	      private CompanyService service;
	      @RequestMapping("/addcom")
	      public String index(Model model){
	    	  Company company=new Company();
	    	  model.addAttribute("company", company);
	    	  return "addCompany";
	      }
	      @RequestMapping(value = "/save", method = RequestMethod.POST)
	    	public String saveCom(@ModelAttribute("company") Company company) {
	    	    service.save(company);    
	    	    return "adminHome";
	    	}
	        @RequestMapping("/view")
	    	public String viewHomePage(Model model) {
	    	    List<Company> listCompany = service.listAll();
	    	    model.addAttribute("listCompany", listCompany);     
	    	    return "viewCompany";
	    	}
	        @RequestMapping("/edit/{id}")
	    	public ModelAndView showEditPage(@PathVariable(name = "id") long id) {
	    	    ModelAndView mav = new ModelAndView("editCompany");
	    	    Company company = service.get(id);
	    	    mav.addObject("company", company);    
	    	    return mav;
	    	}
	    	
	    	@RequestMapping("/delete/{id}")
	    	public String deleteProduct(@PathVariable(name = "id") long id) {
	    	    service.delete(id);
	    	    return "adminHome";       
	    	}
	
}