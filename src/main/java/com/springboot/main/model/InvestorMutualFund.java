package com.springboot.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class InvestorMutualFund {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDate investmentDate;
	private Double amountInvested;
	
	@ManyToOne
	private Investor investor;
	
	@ManyToOne
	private MutualFund mutualFund;

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

	public MutualFund getMutualFund() {
		return mutualFund;
	}

	public void setMutualFund(MutualFund mutualFund) {
		this.mutualFund = mutualFund;
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