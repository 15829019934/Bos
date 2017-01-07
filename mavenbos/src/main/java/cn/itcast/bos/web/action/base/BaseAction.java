package cn.itcast.bos.web.action.base;

import javax.annotation.Resource;

import cn.itcast.bos.service.bc.StandardService;
import cn.itcast.bos.service.user.UserService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 公共 抽象Action （实现代码复用）
 * 
 * @author seawind
 * 
 */
public abstract class BaseAction extends ActionSupport {
	@Resource(name = "userService")
	protected UserService userService;

	@Resource(name = "standardService")
	protected StandardService standardService;
}
