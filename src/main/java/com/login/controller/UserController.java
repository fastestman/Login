package com.login.controller;  
  
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
 




import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.zsl.testmybatis.TestMyBatis;

import com.alibaba.fastjson.JSON;
import com.login.pojo.User;
import com.login.service.IUserService;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	private static Logger logger = Logger.getLogger(UserController.class);  
    @Resource  
    private IUserService userService;  
    @RequestMapping(value="/toLogin") 
    public String toLogin(HttpServletRequest request,Model model){
    	return "login";  
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(User user,Model model) throws Exception {
        user=userService.checkLogin(user.getUsername(), user.getPassword());
        if(user!=null){
            model.addAttribute(user);
            return "welcome";// 路径 WEB-INF/pages/welcome.jsp            
        }
        return "fail";
    }
    
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}  