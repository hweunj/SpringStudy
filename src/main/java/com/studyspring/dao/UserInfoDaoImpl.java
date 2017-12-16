package com.studyspring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studyspring.vo.UserInfoVO;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public String searchNameDao(Map<String, Object> info) {
		System.out.println("user dao call (search name : " + info.get("name").toString());
		
		String name = info.get("name").toString() + "!!";
		return name;
	}

	@Override
	public List<UserInfoVO> getUserInfoListDao() {
		List<UserInfoVO> listuser = new ArrayList<UserInfoVO>();
		
		//DB작업
		
		UserInfoVO user_one = new UserInfoVO();
		user_one.setUserName("서창욱");
		user_one.setUserAge(26);
		user_one.setUserImage("sample1.png");
		
		listuser.add(user_one);
		
		
		UserInfoVO user_two = new UserInfoVO();
		user_two.setUserName("홍길동");
		user_two.setUserAge(30);
		user_two.setUserImage("sample2.png");
		
		listuser.add(user_two);
		
		
		UserInfoVO user_three = new UserInfoVO();
		user_three.setUserName("임꺽정");
		user_three.setUserAge(28);
		user_three.setUserImage("sample3.png");
		
		listuser.add(user_three);
		 
		
		return listuser;
	}
	
	@Override
	public List<Map<String, Object>> searchUserInfoDBDao(Map<String, Object> params) {
		return sqlSession.selectList("usermanager.searchuser", params);
	}

}
