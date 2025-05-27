package com.antvd.models;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String username;
    private String password;

    public Customer(int id, String name, String email, String phone, String username, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }
}
