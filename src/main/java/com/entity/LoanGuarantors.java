package com.entity;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "LoanGuarantors")
public class LoanGuarantors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "fullname")
    public String fullName;

    @Column(name = "business_name")
    public String BusinessName;

    @Column(name = "telephone")
    public Long telephone;

    @Column(name = "email")
    public String email;

    @Column(name = "action")
    public String action;

    public LoanGuarantors(){}
}
