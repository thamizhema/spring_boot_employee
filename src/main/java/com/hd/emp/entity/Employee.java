package com.hd.emp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="employees")
public class Employee {
    public Employee(long id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public Employee() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "first_name")
    private  String firstname;

    @Column(name= "last_name")
    private  String lastname;

    @Column(name="email",nullable = false,unique = true)
    private  String email;



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
