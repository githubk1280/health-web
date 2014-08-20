package com.health.models;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	private int id;
	private Name name;
	private int age;
	private Date birthday;
	
}
