package com.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Others")
public class Others {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    public Others(){}

}
