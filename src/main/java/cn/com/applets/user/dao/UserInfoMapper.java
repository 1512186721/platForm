package cn.com.applets.user.dao;

import java.util.List;

import cn.com.applets.user.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);
    
    List<UserInfo> selectAll(UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}