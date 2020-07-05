package com.milap.timetracker.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Project extends BaseEntity {
	@ManyToOne
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}