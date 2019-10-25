package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "LoanAdvanceSettings")
public class LoanAdvanceSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "decimal_place")
    public float decimalPlace;

    @Column(name = "interest_start_date")
    public Date interestStartDate;

    @Column(name = "firstRepaymentDate")
    public Date firstRepaymentDate;

    @Column(name = "firstRepaymentAmount")
    public int firstRepaymentAmount;

    @Column(name = "lastRepaymentAmount")
    public int lastRepaymentAmount;

    @Column(name = "overwriteMaturityDate")
    public Date overwriteMaturityDate;

    @Column(name = "overwriteEachRepaymentAmountTo")
    public int overwriteEachRepaymentAmountTo;

    @Column(name = "calculateInterestInEachRepayment")
    public boolean calculateInterestInEachRepayment;

    @Column(name = "howShouldInterestByChargedInLoanReschedule")
    public String howShouldInterestByChargedInLoanReschedule;

    @Column(name = "loan_status")
    public String loanStatus;

    public LoanAdvanceSettings(){}
}
