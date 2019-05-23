package com.message.bean;


public class Contract {
	
	private int id;
	private String projectName;
	private String firstName;
	private String secondName;
	private String signedTime;
	private String money; 
	private String limitTime;
	private String paymentMethod;
	private String enteringPerson;
	@Override
	public String toString() {
		return "Contract [id=" + id + ", projectName=" + projectName + ", firstName=" + firstName + ", secondName="
				+ secondName + ", signedTime=" + signedTime + ", money=" + money + ", limitTime=" + limitTime
				+ ", paymentMethod=" + paymentMethod + ", enteringPerson=" + enteringPerson + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getSignedTime() {
		return signedTime;
	}
	public void setSignedTime(String signedTime) {
		this.signedTime = signedTime;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getLimitTime() {
		return limitTime;
	}
	public void setLimitTime(String limitTime) {
		this.limitTime = limitTime;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getEnteringPerson() {
		return enteringPerson;
	}
	public void setEnteringPerson(String enteringPerson) {
		this.enteringPerson = enteringPerson;
	}

	
}
