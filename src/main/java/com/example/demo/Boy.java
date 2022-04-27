package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boys")
public class Boy {


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Id
    String name;
    String surname;

    public Boy(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public Boy(){}
}
