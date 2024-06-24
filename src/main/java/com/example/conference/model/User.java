package com.example.conference.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Your prefix")
    private String prefix;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Your County")
    private String county;

    @NotBlank(message = "Your Designation")
    private String designation;

    @NotBlank(message = "Abstract")
    private String abstracts;

    @NotBlank(message = "If yes, Title of Abstract")
    private String title;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Your telephone number")
    private String phone;


    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public  String  getDesignation() {
        return designation;
    }
    public  void setDesignation(String Designation) {
        this.designation = designation;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
