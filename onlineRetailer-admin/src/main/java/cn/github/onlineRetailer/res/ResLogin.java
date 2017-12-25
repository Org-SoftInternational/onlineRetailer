package cn.github.onlineRetailer.res;

import cn.github.onlineRetailer.DummySuccess;
import cn.github.onlineRetailer.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ResLogin extends DummySuccess{
	
    private static final long serialVersionUID = 4592261792660786661L;
    private User user;
}
