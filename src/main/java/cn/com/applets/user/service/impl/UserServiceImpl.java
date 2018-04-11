package cn.com.applets.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.applets.user.dao.UserInfoMapper;
import cn.com.applets.user.model.UserInfo;
import cn.com.applets.user.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {
	
	@Autowired  
	private UserInfoMapper userInfoMapper;  

	public UserInfo getUserById(Long id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	public List<UserInfo> getUsers(UserInfo record) {
		return userInfoMapper.selectAll(record);
	}

	public int insert(UserInfo userInfo) {
		return userInfoMapper.insert(userInfo);
	}

}
