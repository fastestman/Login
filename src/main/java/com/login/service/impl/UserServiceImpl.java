package com.login.service.impl;  
  
import javax.annotation.Resource;  
  







import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;  
import org.zsl.testmybatis.TestMyBatis;

import com.alibaba.fastjson.JSON;
import com.login.dao.UserMapper;
import com.login.pojo.User;
import com.login.service.IUserService;
@Service("userService")  
public class UserServiceImpl implements IUserService {  
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);  
    @Resource  
    private UserMapper userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
    
    /* 登陆验证 */
    public User checkLogin(String username, String password) {
    	
    	User user = userDao.getUserByName(username);
    	logger.info(JSON.toJSONString(user));  
    	if (user != null && password.equals(user.getPassword())) {
    		return user;
    	}
    	return null;
    }
}  