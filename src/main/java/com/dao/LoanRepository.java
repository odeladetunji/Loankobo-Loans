package com.dao;

import com.entity.Loans;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loans, Long> {

}
