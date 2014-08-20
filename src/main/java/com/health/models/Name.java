package com.health.models;

import lombok.Data;

@Data
public class Name {
	public Name(String name) {
		this.name = name;
	}

	private String name;
}
