package com.health.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.models.Member;

@Service
public class DataService {
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public void getMember(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println(sqlSession.selectOne("getMemberById",50410));
	}
	
	public int batchAddMembers(List<Member> list){
		SqlSession sqlSession = sqlSessionFactory.openSession();
//		return sqlSession.getMapper(MemberMapper.class).batchAddMembers(list, 26);
		Map map = new HashMap ();
		Map map2 = new HashMap ();
		map.put("list", list);
		map2.put("age", 26);
		map2.put("birthday", "1900-02-02");
		map.put("map2", map2);
		
		return sqlSession.update("batchAddMembers", map);
	}
	
	public String sayHi(){
		return "hi ";
	}
}
