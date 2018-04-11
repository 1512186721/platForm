package cn.com.applets.user.service;

import java.util.List;

import cn.com.applets.user.model.UserInfo;

public interface UserService {
	UserInfo getUserById(Long id);  
    
    List<UserInfo> getUsers(UserInfo userInfo);  
      
    int insert(UserInfo userInfo);  
}
