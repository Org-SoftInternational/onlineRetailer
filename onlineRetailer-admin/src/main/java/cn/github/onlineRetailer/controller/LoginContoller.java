package cn.github.onlineRetailer.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.github.onlineRetailer.entity.User;
import cn.github.onlineRetailer.res.ResLogin;
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

	@Reference
	UserService userService;

	@RequestMapping(value = "/login")
	@ResponseBody
	public ResLogin login(@RequestBody User req) throws Exception {
		User user = userService.getUser(req.getUserName(), req.getPassword());
		ResLogin res = new ResLogin();
		if (null != user) {
			log.info(user.toString());
			res.setReturnCode("200");
		}
		res.setUser(user);
		
		return res;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public String register(@RequestBody User user) throws Exception {
		userService.addUser(user);
		log.info(user);
		
		return "ok";
	}
	//redis樣例
	@RequestMapping(value = "/findset")
	@ResponseBody
	public String findset() throws Exception {

		return userService.findSet();
	}
}
