package com.example.tourly.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class User {

    @Getter
    @Id
    @GeneratedValue

    private Long id;
    @Getter
    private String username;
    @Getter
    private  String password;
    @Column(unique = true)
    private String email;

    public void setId(Long id) {
        this.id = id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {

        this.password = password;
    }


}
