package com.luxoft.logeek.entity;

import javax.persistence.*;

@Entity
public class SimpleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
