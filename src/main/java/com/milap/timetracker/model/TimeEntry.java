package com.milap.timetracker.model;

import java.time.LocalDate;

public class TimeEntry extends BaseEntity {
	private User user;
	private Issue issue;
	private String description;
	private LocalDate date;
	private String loggedTime;
	private double actualTimeInHour;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLoggedTime() {
		return loggedTime;
	}

	public void setLoggedTime(String loggedTime) {
		this.loggedTime = loggedTime;
	}

	public double getActualTimeInHour() {
		return actualTimeInHour;
	}

	public void setActualTimeInHour(double actualTimeInHour) {
		this.actualTimeInHour = actualTimeInHour;
	}
}
