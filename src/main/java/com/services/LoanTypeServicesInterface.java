package com.services;

import com.models.LoanTypes;

import java.util.List;

public interface LoanTypeServicesInterface {
    List<LoanTypes> getLoanTypes();
    String deleteLoanType(LoanTypes payload);
    String addLoanType(String payload);
    String upDateLoanType(LoanTypes payload);
}
