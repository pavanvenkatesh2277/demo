package com.springboot.main.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String category;
	private LocalDate Startdate;
	private LocalDate enddate;
	private double premimum;
	private int policytenure;
	private int maturity;
	
	@ManyToOne
	private Company Company;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getStartdate() {
		return Startdate;
	}

	public void setStartdate(LocalDate startdate) {
		Startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}

	public double getPremimum() {
		return premimum;
	}

	public void setPremimum(double premimum) {
		this.premimum = premimum;
	}

	public int getPolicytenure() {
		return policytenure;
	}

	public void setPolicytenure(int policytenure) {
		this.policytenure = policytenure;
	}

	public int getMaturity() {
		return maturity;
	}

	public void setMaturity(int maturity) {
		this.maturity = maturity;
	}

	public Company getCompany() {
		return Company;
	}

	public void setCompany(Company company) {
		Company = company;
	}

	

}