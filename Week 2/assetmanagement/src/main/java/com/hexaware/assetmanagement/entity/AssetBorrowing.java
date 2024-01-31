package com.hexaware.assetmanagement.entity;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "asset_borrowings")
public class AssetBorrowing {
    
    @Id
    private Long id;
    
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;
    
    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Assets assets;
    
    @Column(name = "borrow_date")
    private LocalDate borrowDate;
    
    @Column(name = "return_date")
    private LocalDate returnDate;
    
    public AssetBorrowing() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Assets getAsset() {
        return assets;
    }

    public void setAsset(Assets assets) {
        this.assets = assets;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
