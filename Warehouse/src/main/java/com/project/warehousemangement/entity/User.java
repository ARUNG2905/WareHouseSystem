package com.project.warehousemangement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
//@EntityListeners()
@Entity
class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid", nullable = false,updatable = false)
private String userid;

    @Column(name = "username",nullable = false)
private String username;

    @Column(name = "email",nullable = false)
private String email;
    @Column(name = "password",nullable = false)
private String password;
}