package cn.github.onlineRetailer.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.github.onlineRetailer.entity.User;
import cn.github.onlineRetailer.service.UserService;

/**
 * @Description
 * @author disanmeng
 * @date 2017年11月15日 下午7:50:54
 */

@Controller
@RequestMapping("/onlineRetailer")
public class LoginContoller {
	
	private static final Log log = LogFactory.getLog(LoginContoller.class);
    @RequestMapping(value = "/login")
    @ResponseBody
    public User login(@RequestBody User user) throws Exception {
        return user;
    }
    
    @RequestMapping(value = "/register")
    @ResponseBody
    public String register(@RequestBody User user) throws Exception {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:*.xml");
    	 UserService userService = null;
         context.start();
         try{
        	userService = (UserService) context.getBean("userService");
         }catch(Exception e){
        	 log.error(e);
         }
        
         
       userService.AddUser(user);
       return "ok";
    }
}
