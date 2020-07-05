package com.milap.timetracker.model;

import javax.persistence.Entity;

@Entity
public class Priority extends BaseEntity {
	private int priorityValue;

	public int getPriorityValue() {
		return priorityValue;
	}

	public void setPriorityValue(int priorityValue) {
		this.priorityValue = priorityValue;
	}
}
