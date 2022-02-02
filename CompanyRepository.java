package com.PlacmentManagmentSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacmentManagmentSystem.Entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
