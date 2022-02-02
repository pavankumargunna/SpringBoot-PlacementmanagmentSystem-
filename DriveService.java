package com.PlacmentManagmentSystem.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacmentManagmentSystem.Entity.Drive;
import com.PlacmentManagmentSystem.Repository.DriveRepository;

@Service
public class DriveService {
	@Autowired
    private DriveRepository repo;
     
    public List<Drive> listAll() {
        return repo.findAll();
    }
     
    public void save(Drive drive) {
        repo.save(drive);
    }
     
    public Drive get(long id) {
        return repo.findById(id).get();
    }
    public void delete(long id) {
        repo.deleteById(id);
    }

}
