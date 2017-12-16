package cn.github.onlineRetailer.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import cn.github.onlineRetailer.DummySuccess;
import cn.github.onlineRetailer.entity.User;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResLogin extends DummySuccess{
	
	 private User user;
}
