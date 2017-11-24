package cn.github.onlineRetailer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.github.onlineRetailer.dubbo.service.DubboDemoService;
import cn.github.onlineRetailer.entity.User;

/**
 * @Description
 * @author disanmeng
 * @date 2017年11月17日 上午11:33:39
 */

public class DubboComsumer {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo.xml");
        context.start();
        DubboDemoService dubboDemoService = (DubboDemoService) context.getBean("dubboDemoService");
        User user = dubboDemoService.getUser("yang", "123");
        System.out.println(user);
        
    }
}
