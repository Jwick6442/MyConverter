package com.example.myconverter.model;


public class Currency {
	private String nation;
	private Double money;
	
	public Currency (String nation, Double money) {
		this.nation = nation;
		this.money = money;	
	}
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
}
