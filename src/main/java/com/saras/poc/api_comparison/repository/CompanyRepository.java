package com.saras.poc.api_comparison.repository;

import com.saras.poc.api_comparison.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
