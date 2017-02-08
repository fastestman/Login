package com.login.service;  
  
import com.login.pojo.User;  
  
public interface IUserService {  
    public User getUserById(int userId);  
    public User checkLogin(String username, String password);
}  