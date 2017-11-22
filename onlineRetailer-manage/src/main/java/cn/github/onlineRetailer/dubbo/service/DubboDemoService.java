package cn.github.onlineRetailer.dubbo.service;

import cn.github.onlineRetailer.entity.User;

/** 
 * @Description 
 * @author disanmeng
 * @date 2017年11月17日 上午11:45:40 
 */

public interface DubboDemoService {
    
    User getUser(String name, String password);
    
}
