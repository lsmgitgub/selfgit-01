package com.message.bean;

public class ReturnMoney {
	private int id;
	private String projectMessage;
	private int money;
	private String schedule;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectMessage() {
		return projectMessage;
	}
	public void setProjectMessage(String projectMessage) {
		this.projectMessage = projectMessage;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "BeginTicket [id=" + id + ", projectMessage=" + projectMessage + ", money=" + money + ", schedule="
				+ schedule + "]";
	}
	
}
