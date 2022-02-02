package com.PlacmentManagmentSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.PlacmentManagmentSystem.Entity.Drive;
import com.PlacmentManagmentSystem.Service.DriveService;

@Controller
public class DriveController {
	@Autowired
    private DriveService servicee;
	@RequestMapping("/adddrv")
    public String indexDrive(Model model){
  	  Drive drive=new Drive();
  	  model.addAttribute("drive", drive);
  	  return "addDrive";
    }
	@RequestMapping(value = "/savee", method = RequestMethod.POST)
  	public String saveDrv(@ModelAttribute("drive") Drive drive) {
  	    servicee.save(drive);    
  	    return "adminHome";
  	}
	@RequestMapping("/viewdrv")
  	public String viewHomePage1(Model model) {
  	    List<Drive> listDrive = servicee.listAll();
  	    model.addAttribute("listDrive", listDrive);     
  	    return "viewDrive";
  	}
	@RequestMapping("/editt/{id}")
  	public ModelAndView showEditPage1(@PathVariable(name = "id") long id) {
  	    ModelAndView mav = new ModelAndView("editDrive");
  	    Drive drive = servicee.get(id);
  	    mav.addObject("drive", drive);    
  	    return mav;
  	}
	@RequestMapping("/deletee/{id}")
  	public String deleteDrive(@PathVariable(name = "id") long id) {
  	    servicee.delete(id);
  	    return "adminHome";       
  	}

}
