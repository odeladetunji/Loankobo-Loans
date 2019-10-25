package com.services;

import com.models.Biodata;

import java.util.List;

public interface LoansServiceInterface {
    void checkUnfinishedLoad(Biodata payload);
    void newLoan(Biodata payload);

}
