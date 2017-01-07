package cn.itcast.bos.service.base;

import javax.annotation.Resource;

import cn.itcast.bos.dao.GenericDAO;
import cn.itcast.bos.domain.bc.Standard;
import cn.itcast.bos.domain.user.User;

/**
 * 业务层 抽象 （实现业务层代码复用）
 * 
 * @author seawind
 * 
 */
public abstract class BaseService {
	@Resource(name = "userDAO")
	protected GenericDAO<User> userDAO;

	@Resource(name = "standardDAO")
	protected GenericDAO<Standard> standardDAO;
}
