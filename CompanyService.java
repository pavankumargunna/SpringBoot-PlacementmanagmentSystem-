package com.PlacmentManagmentSystem.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacmentManagmentSystem.Entity.Company;
import com.PlacmentManagmentSystem.Repository.CompanyRepository;

@Service

public class CompanyService {
	@Autowired
    private CompanyRepository repo;
     
    public List<Company> listAll() {
        return repo.findAll();
    }
     
    public void save(Company company) {
        repo.save(company);
    }
     
    public Company get(long id) {
        return repo.findById(id).get();
    }
    public void delete(long id) {
        repo.deleteById(id);
    }

}
