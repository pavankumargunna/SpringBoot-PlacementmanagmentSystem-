package com.PlacmentManagmentSystem.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacmentManagmentSystem.Entity.Query;
import com.PlacmentManagmentSystem.Repository.querRepository;
@Service
public class queryService {
	@Autowired
	private querRepository qrepo;
	public List<Query> liQueries() {
        return qrepo.findAll();
    }


}
