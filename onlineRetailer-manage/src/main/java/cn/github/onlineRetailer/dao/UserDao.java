package cn.github.onlineRetailer.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.github.onlineRetailer.entity.User;

/** 
 * @Description 
 * @author disanmeng
 * @date 2017年11月15日 上午10:46:43 
 */

@Repository
public interface UserDao {
    
    public int insertUser(User user);
    
    public User getUser(@Param("name") String name, @Param("password") String password);
//    public int deleteUserById(String id);
    
//    public int updateUser(User user);

}
