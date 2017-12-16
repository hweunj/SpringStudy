package com.studyspring.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.studyspring.dao.UserInfoDao;
import com.studyspring.vo.UserInfoEnrollRequestVO;
import com.studyspring.vo.UserInfoVO;

public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	UserInfoDao useInfoDao;
	
	
	@Override
	public String searchNameService(Map<String, Object> info) {
		// TODO Auto-generated method stub
		return useInfoDao.searchNameDao(info);
	}


	@Override
	public int enrollUserInfoService(UserInfoEnrollRequestVO userInfoEnrollRequestVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserInfoVO> getUserInfoListService() {
		// TODO Auto-generated method stub
		return useInfoDao.getUserInfoListDao();
	}
	
	@Override
	public List<Map<String, Object>> searchUserInfoDBService(Map<String, Object> params) {
		return useInfoDao.searchUserInfoDBDao(params);
	}
	

}
