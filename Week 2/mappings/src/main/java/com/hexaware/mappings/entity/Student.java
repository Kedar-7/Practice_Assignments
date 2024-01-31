package com.hexaware.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student{

	@Id
	private int studentId;
	private String studentAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aid")
	private Address address;

	public Student() {
		super();
	}
	public Student(int studentId, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentAddress = studentAddress;
	}

	public Student(int studentId, String studentAddress, Address address) {
		super();
		this.studentId = studentId;
		this.studentAddress = studentAddress;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentAddress=" + studentAddress + ", address=" + address + "]";
	} 
	
}