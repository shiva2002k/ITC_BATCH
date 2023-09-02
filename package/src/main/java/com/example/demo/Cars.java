package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cars 
{
@Id
@GeneratedValue
private Integer carno;
private String carname;
private Integer seater;
private String model;
private double milage;
private boolean Avail;
public Integer getCarno() {
	return carno;
}

public boolean isAvail() {
	return Avail;
}

public void setAvail(boolean avail) {
	Avail = avail;
}

public void setCarno(Integer carno) {
	this.carno = carno;
}
public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public Integer getSeater() {
	return seater;
}
public void setSeater(Integer seater) {
	this.seater = seater;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getMilage() {
	return milage;
}
public void setMilage(double milage) {
	this.milage = milage;
}
public Cars(Integer carno, String carname, Integer seater, String model, double milage,boolean avail) {
	super();
	this.carno = carno;
	this.carname = carname;
	this.seater = seater;
	this.model = model;
	this.milage = milage;
	this.Avail=avail;
}
@Override
public String toString() {
	return "Cars [carno=" + carno + ", carname=" + carname + ", seater=" + seater + ", model=" + model + ", milage="
			+ milage + "]";
}
public Cars() {
	super();
}
}
