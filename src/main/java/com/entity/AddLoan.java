package com.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AddLoan")
public class AddLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "loan_type")
    public String loanType;

    @Column(name = "borrower")
    public String borrower;

    @Column(name = "loan_amount")
    public int loanAmount;

    public AddLoan(){}

}


