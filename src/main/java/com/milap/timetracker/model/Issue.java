package com.milap.timetracker.model;

public class Issue extends BaseEntity {
	private String number;
	private String description;
	private Project project;
	private Priority priority;
	private Status status;
	private double timeLogged;
	private User createdByUser;
	private User assignedToUser;
	private double timeEstimated;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public double getTimeLogged() {
		return timeLogged;
	}

	public void setTimeLogged(double timeLogged) {
		this.timeLogged = timeLogged;
	}

	public User getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(User createdByUser) {
		this.createdByUser = createdByUser;
	}

	public User getAssignedToUser() {
		return assignedToUser;
	}

	public void setAssignedToUser(User assignedToUser) {
		this.assignedToUser = assignedToUser;
	}

	public double getTimeEstimated() {
		return timeEstimated;
	}

	public void setTimeEstimated(double timeEstimated) {
		this.timeEstimated = timeEstimated;
	}
}
