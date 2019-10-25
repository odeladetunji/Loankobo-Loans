package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table (name = "LoanTerms")
public class LoanTerms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "amount")
    public long amount;

    @Column(name = "endDate")
    public Date endDate;

    @Column(name = "interest")
    public int interest;

    @Column(name = "disbursedBy")
    public String disbursedBy;

    @Column(name = "principal_amount")
    public int principalAmount;

    @Column(name = "interest_method")
    public String interestMethod;

    @Column(name = "interest_type")
    public String interestType;

    @Column(name = "payment_frequency")
    public String paymentFrequency;

    @Column(name = "interest_frequency")
    public String interestFrequency;

    @Column(name = "number_of_Repayment")
    public String numberOfRepayment;

    public LoanTerms(){} //for JPA
}
