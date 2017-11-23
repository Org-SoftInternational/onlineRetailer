package cn.github.onlineRetailer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.github.onlineRetailer.entity.User;

/**
 * @Description
 * @author disanmeng
 * @date 2017年11月15日 下午7:50:54
 */

@Controller
@RequestMapping("/onlineRetailer")
public class LoginContoller {

    @RequestMapping(value = "/login")
    @ResponseBody
    public User login(@RequestBody User user) throws Exception {
        return user;
    }
}
