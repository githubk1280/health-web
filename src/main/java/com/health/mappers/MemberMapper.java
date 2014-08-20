package com.health.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.health.models.Member;


@Repository
public interface MemberMapper {
	int batchAddMembers(List<Member> members,int age,String birthday); 
}
