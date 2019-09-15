package com.milap.timetracker.model;

public class Project extends BaseEntity {
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}