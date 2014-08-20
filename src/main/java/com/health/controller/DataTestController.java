package com.health.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.health.factory.Car;
import com.health.models.Member;
import com.health.models.Name;
import com.health.services.DataService;

@Controller
@RequestMapping("/data")
public class DataTestController {
	@Autowired
	DataService dataService ;
	
	@RequestMapping("/index")
	public String index(){
		System.out.println(dataService.sayHi());
		return "index";
		
	}
	
	@Autowired
	Car car;
	@RequestMapping("/load")
	public String load(){
		dataService.getMember();
		System.out.println(car);
		return "load";
		
	}
	
	@RequestMapping("/add/members")
	public String add(){
		List<Member> members = new ArrayList<Member>();
		Member member = null;
		for(int i = 0;i<200;i++){
			member = new Member ();
			member.setName(new Name ("JAMES NAME -age-birthday"+i));
			members.add(member);
		}
		System.out.println(dataService.batchAddMembers(members));
		return "load";
		
	}
}
