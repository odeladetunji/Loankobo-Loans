package com.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ExtendLoanAfterMaturity")
public class ExtendLoanAfterMaturity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "extend_loan_after_maturity")
    public boolean extendLoanAfterMaturity;

    @Column(name = "interest_type")
    public String interestType;

    @Column(name = "calculate_interest_on")
    public String calculateInterestOn;

    @Column(name = "loan_interest_rate_after_maturity")
    public int loanInterestRateAfterMaturity;

    @Column(name = "recuring_period_after_maturity")
    public String recuringPeriodAfterMaturity;

    @Column(name = "include_fees_after_maturity")
    public boolean includeFeesAfterMaturity;
}
