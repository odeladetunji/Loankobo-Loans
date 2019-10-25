package com.services;

import com.dao.LoanRepository;
import com.dao.LoanTypesRepository;
import com.models.Biodata;
import com.models.LoanTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServices implements LoansServiceInterface {

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    LoanTypesRepository loanTypesRepository;

    @Override
    public void checkUnfinishedLoad(Biodata payload){

    }

    @Override
    public void newLoan(Biodata payload){
        checkUnfinishedLoad(payload); // first check for unfinished loan payment
    }


}





























