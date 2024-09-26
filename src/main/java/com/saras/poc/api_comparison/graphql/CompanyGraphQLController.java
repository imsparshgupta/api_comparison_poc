package com.saras.poc.api_comparison.graphql;

import com.saras.poc.api_comparison.model.Company;
import com.saras.poc.api_comparison.repository.CompanyRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;

@Controller
public class CompanyGraphQLController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyGraphQLController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @QueryMapping
    public Iterable<Company> allCompanies() {
        return companyRepository.findAll();
    }

    @SchemaMapping(typeName = "Mutation")
    public Company createCompany(@Argument String name, @Argument String address) {
        Company company = new Company(name, address);
        return companyRepository.save(company);
    }
}
