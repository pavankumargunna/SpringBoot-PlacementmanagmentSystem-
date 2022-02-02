package com.PlacmentManagmentSystem.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.PlacmentManagmentSystem.Repository.StudentRepository;
public class CustomStudentDetailsService implements UserDetailsService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Student student=studentRepo.findByEmail(username);
		if(student==null){
			throw new UsernameNotFoundException("User not found");
		}
		return null;
	}



}
