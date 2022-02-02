package com.PlacmentManagmentSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PlacmentManagmentSystem.Entity.Query;
import com.PlacmentManagmentSystem.Service.queryService;

@Controller
public class AdminController {
	
	@GetMapping("/admlogin")
	public String index1() {
		return "adminLogin"; 
	}
	@GetMapping("/admhome")
	public String index5() {
		return "adminHome"; 
	}
	@Autowired
	public queryService srvice;
	@RequestMapping("/viewquery")
  	public String viewHomePage1(Model model) {
  	    List<Query> listQuery = srvice.liQueries();
  	    model.addAttribute("listQuery", listQuery);     
  	    return "viewQuery";
  	}
}
