package cn.itcast.bos.service.bc;

import cn.itcast.bos.domain.bc.Standard;

/**
 * 收派标准 业务接口
 * 
 * @author seawind
 * 
 */
public interface StandardService {

	/**
	 * 保存标准
	 * 
	 * @param standard
	 */
	public void saveStandard(Standard standard);

}
