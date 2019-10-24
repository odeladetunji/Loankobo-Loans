package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table (name = "loans")
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "amount")
    public long amount;

    @Column(name = "start_date")
    public Date startDate;

    @Column(name = "endDate")
    public Date endDate;

    @Column(name = "interest")
    public int interest;

    public Loans(){} //for JPA
}
