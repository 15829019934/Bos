package cn.itcast.bos.web.action.bc;

import java.sql.Timestamp;

import org.apache.struts2.ServletActionContext;

import cn.itcast.bos.domain.bc.Standard;
import cn.itcast.bos.domain.user.User;
import cn.itcast.bos.web.action.base.BaseAction;

import com.opensymphony.xwork2.ModelDriven;

/**
 * 收派标准管理
 * 
 * @author seawind
 * 
 */
public class StandardAction extends BaseAction implements ModelDriven<Standard> {

	// 模型驱动
	private Standard standard = new Standard();

	@Override
	public Standard getModel() {
		return standard;
	}

	// 业务方法 --- 保存标准
	public String save() {
		// 完善model数据
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		standard.setUser(user);
		standard.setUpdatetime(new Timestamp(System.currentTimeMillis()));

		// 调用业务层保存数据
		standardService.saveStandard(standard);
		return "saveSUCCESS";
	}

}
