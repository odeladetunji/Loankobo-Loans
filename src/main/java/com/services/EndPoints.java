package com.services;

import com.dao.LoanRepository;
import com.models.Biodata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndPoints implements LoansServiceInterface {

    @Autowired
    LoanRepository loanRepository;

    @Override
    public void checkUnfinishedLoad(Biodata payload){

    }

    @Override
    public void newLoan(Biodata payload){
        checkUnfinishedLoad(payload); // first check for unfinished loan payment
    }

}





























