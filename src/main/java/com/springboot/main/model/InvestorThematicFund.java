package com.springboot.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InvestorThematicFund {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDate investmentDate;
	private Double amountInvested;
	
	@ManyToOne
	private Investor investor;
	
	@ManyToOne
	private ThematicFund thematicFund;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Investor getInvestor() {
		return investor;
	}

	public void setInvestor(Investor investor) {
		this.investor = investor;
	}

	public ThematicFund getThematicFund() {
		return thematicFund;
	}

	public void setThematicFund(ThematicFund thematicFund) {
		this.thematicFund = thematicFund;
	}

	public LocalDate getInvestmentDate() {
		return investmentDate;
	}

	public void setInvestmentDate(LocalDate investmentDate) {
		this.investmentDate = investmentDate;
	}

	public Double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(Double amountInvested) {
		this.amountInvested = amountInvested;
	}

	
	
}