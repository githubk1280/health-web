package com.health.factory;

import java.io.Serializable;

import lombok.Data;

@Data
public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5351328711282234028L;
	private String color;
	private String brand;

	public Car(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

	public Car() {
	}
}
