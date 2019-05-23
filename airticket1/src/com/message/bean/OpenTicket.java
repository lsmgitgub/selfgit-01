package com.message.bean;

public class OpenTicket {


	private String date;
	private int money;
	private int ticketNumber;
	private String taxRate;
	@Override
	public String toString() {
		return "OpenTicket [date=" + date + ", money=" + money + ", taxRate=" + taxRate + ", ticketNumber="
				+ ticketNumber + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	
	
}