package com.dao;


import com.entity.LoanTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanTypesRepository extends CrudRepository<LoanTypes, Long> {
    @Override
    Iterable<LoanTypes> findAll();

    @Override
    void deleteById(Long aLong);

    @Override
    Optional<LoanTypes> findById(Long aLong);

}


