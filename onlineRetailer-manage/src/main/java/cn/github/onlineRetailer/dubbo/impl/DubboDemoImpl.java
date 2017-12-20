package cn.github.onlineRetailer.dubbo.impl;

import cn.github.onlineRetailer.dubbo.service.DubboDemoService;
import cn.github.onlineRetailer.entity.User;

/**
 * @Description
 * @author disanmeng
 * @date 2017年11月17日 上午11:48:35
 */

@com.alibaba.dubbo.config.annotation.Service
public class DubboDemoImpl implements DubboDemoService {

    public User getUser(String name, String password) {
        if ("yang".equals(name) && "123".equals(password)) {
//            return new User("yang", "123", "18351451741@163.com", "", "", "");
        }
        return null;
    }

}
