package com.services;

import com.models.Biodata;

public interface LoansServiceInterface {
    void checkUnfinishedLoad(Biodata payload);
    void newLoan(Biodata payload);
}
