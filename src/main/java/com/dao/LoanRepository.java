package com.dao;

import com.entity.LoanTerms;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<LoanTerms, Long> {

}
