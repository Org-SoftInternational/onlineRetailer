package cn.github.onlineRetailer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
 * @Description 
 * @author disanmeng
 * @date 2017年11月15日 上午12:51:36 
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    private String id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    
}
