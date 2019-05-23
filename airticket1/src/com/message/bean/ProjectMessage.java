package com.message.bean;

public class ProjectMessage {
	private int id;
	private String projectName;
	private String arriveDate;
	private String beginDate;
	private String completionDate;
	private String acceptanceDate;
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
	public String getArriveDate() {
		return arriveDate;
	}
	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getAcceptanceDate() {
		return acceptanceDate;
	}
	public void setAcceptanceDate(String acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}
	@Override
	public String toString() {
		return "Projectmessage [id=" + id + ", projectName=" + projectName + ", arriveDate=" + arriveDate
				+ ", beginDate=" + beginDate + ", completionDate=" + completionDate + ", acceptanceDate="
				+ acceptanceDate + "]";
	}
	
}
