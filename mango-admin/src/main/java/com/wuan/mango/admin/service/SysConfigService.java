package com.wuan.mango.admin.service;

import java.util.List;

import com.wuan.mango.admin.model.SysConfig;
import com.wuan.mango.core.service.CurdService;

/**
 * 系统配置管理
 * @author gaoxiang
 * @date 2020/01/23
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
