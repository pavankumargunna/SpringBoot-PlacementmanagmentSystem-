package com.PlacmentManagmentSystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.PlacmentManagmentSystem.Entity.Apply;
import com.PlacmentManagmentSystem.Entity.Company;
import com.PlacmentManagmentSystem.Entity.Drive;
import com.PlacmentManagmentSystem.Entity.Query;
import com.PlacmentManagmentSystem.Entity.Student;
import com.PlacmentManagmentSystem.Repository.StudentRepository;
import com.PlacmentManagmentSystem.Repository.applyRepository;
import com.PlacmentManagmentSystem.Repository.querRepository;
import com.PlacmentManagmentSystem.Service.CompanyService;
import com.PlacmentManagmentSystem.Service.DriveService;



@Controller
public class StudentController {
	@Autowired
	private StudentRepository srepo;
	
	@GetMapping("/")
	public String index() {
		return "MainHome"; 
	}
	
	@GetMapping("/stdlogin")
	public String index1() {
		return "studentLogin"; 
	}
	
	@GetMapping("/stdregister")
	public String index1(Model model) {
		model.addAttribute("student", new Student());
		return "std_register";
	}
	
	@PostMapping("/stdlogin")
	public String index2(Student student) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodePassword = passwordEncoder.encode(student.getPassword());
		student.setPassword(encodePassword);
		srepo.save(student);
		return "studentLogin";
	}
	@GetMapping("/stdhome")
	public String index5() {
		return "studentHome"; 
	}

	@Autowired
    private CompanyService service;
    @GetMapping("/scompany")
    public String viewJobs(Model model) {
	 List<Company> listcom = service.listAll();
	    model.addAttribute("listcom", listcom);
	    return "studentcompany";
 }
    @Autowired
    private DriveService dservice;
    @GetMapping("/sdrive")
    public String viewDrive(Model model) {
	 List<Drive> listdrv = dservice.listAll();
	    model.addAttribute("listdrv", listdrv);
	    return "studentDrive";
 }

    @GetMapping("/apply")
	public String apply(Model model) {
		model.addAttribute("apply", new Apply());
		return "applyCompany";
	}
    @Autowired
  private applyRepository arepo;
    @PostMapping("/succes")
	public String success(Apply apply){
		arepo.save(apply);
		return "succes";
	}
    @GetMapping("/anyquery")
	public String query(Model model) {
    	model.addAttribute("query",new Query());
		return "anyQuery"; 
	}

    @Autowired
    private querRepository qrepo;
    @PostMapping("/stdhome")
	public String query(Query query){
		qrepo.save(query);
		return "studentHome";
	}
    
    
    @GetMapping("/upload")
	public String resume() {
		return "uploadResume"; 
	}




}
