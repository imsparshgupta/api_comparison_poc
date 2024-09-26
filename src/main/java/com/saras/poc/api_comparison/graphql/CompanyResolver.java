//package com.saras.poc.api_comparison.graphql;
//
//import com.saras.poc.api_comparison.model.Company;
//import com.saras.poc.api_comparison.repository.CompanyRepository;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import graphql.kickstart.tools.GraphQLMutationResolver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class CompanyResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
//
//    @Autowired
//    private CompanyRepository companyRepository;
//
//    public List<Company> allCompanies() {
//        return companyRepository.findAll();
//    }
//
//    public Company createCompany(String name, String address) {
//        Company company = new Company(name, address);
//        return companyRepository.save(company);
//    }
//}
