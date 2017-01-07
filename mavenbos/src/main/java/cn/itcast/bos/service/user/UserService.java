package cn.itcast.bos.service.user;

import cn.itcast.bos.domain.user.User;

/**
 * 用户管理 业务接口
 * 
 * @author seawind
 * 
 */
public interface UserService {

	// 登陆
	public User login(User user);

	// 修改密码
	public void editPassword(User user);

}
