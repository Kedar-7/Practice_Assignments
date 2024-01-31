package com.hexaware.assetmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "assets")
public class Assets {
    
    @Id
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "status", nullable = false)
    private String status; 
    
    // Constructors
    public Assets() {
    }
    
    public Assets(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
