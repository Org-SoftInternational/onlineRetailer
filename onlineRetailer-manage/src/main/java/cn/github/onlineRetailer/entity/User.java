package cn.github.onlineRetailer.entity;

import java.io.Serializable;

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
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer userId;
    private String userName;
    private String password;
	private String email;
    private String phone;
    private String address;  

}
