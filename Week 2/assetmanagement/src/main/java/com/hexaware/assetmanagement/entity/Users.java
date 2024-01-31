package com.hexaware.assetmanagement.entity;

import javax.persistence.*;

@MappedSuperclass
public class Users {
    
    @Id
    private Long id;
    
    @Column(name = "username", unique = true, nullable = false)
    private String username;
    
    @Column(name = "password", nullable = false)
    private String password;
    
    // Constructors
    public Users() {
    }
    
    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
