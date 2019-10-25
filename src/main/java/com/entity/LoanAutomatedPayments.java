package com.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LoanAutomatedPayments")
public class LoanAutomatedPayments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "add_automated_payment")
    public boolean addAutomatedPayment;

    @Column(name = "time_to_post_between")
    public String timeToPostBetween;

    public LoanAutomatedPayments(){}
}
