package com.example.demo.entity;



 

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

 

@Entity

public class Owner {

 

    @Id

    @GeneratedValue

    private Integer uid;

    private String name;

    private String email;

    private String phoneNo;

    private String adharNumber;

    private String carModel;

    private String carNumber;

 

    public Integer getUid() {

        return uid;

    }

 

    public void setUid(Integer uid) {

        this.uid = uid;

    }

 

    public String getName() {

        return name;

    }

 

    public void setName(String name) {

        this.name = name;

    }

 

    public String getEmail() {

        return email;

    }

 

    public void setEmail(String email) {

        this.email = email;

    }

 

    public String getPhoneNo() {

        return phoneNo;

    }

 

    public void setPhoneNo(String phoneNo) {

        this.phoneNo = phoneNo;

    }

 

    public String getAdharNumber() {

        return adharNumber;

    }

 

    public void setAdharNumber(String adharNumber) {

        this.adharNumber = adharNumber;

    }

 

    public String getCarModel() {

        return carModel;

    }

 

    public void setCarModel(String carModel) {

        this.carModel = carModel;

    }

 

    public String getCarNumber() {

        return carNumber;

    }

 

    public void setCarNumber(String carNumber) {

        this.carNumber = carNumber;

    }

 

    public Owner(Integer uid, String name, String email, String phoneNo, String adharNumber, String carModel,
			String carNumber) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.adharNumber = adharNumber;
		this.carModel = carModel;
		this.carNumber = carNumber;
	}



	public Owner() {
		super();
	}



	@Override

    public String toString() {

        return "Owner [uid=" + uid + ", name=" + name + ", email=" + email +

                ", phoneNo=" + phoneNo + ", adharNumber=" + adharNumber +

                ", carModel=" + carModel + ", carNumber=" + carNumber + "]";

    }

}
