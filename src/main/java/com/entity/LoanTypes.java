package com.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table (name = "LoanTerms")
public class LoanTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "type")
    public String type;

}
