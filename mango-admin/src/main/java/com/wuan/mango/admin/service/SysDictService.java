package com.wuan.mango.admin.service;

import java.util.List;

import com.wuan.mango.admin.model.SysDict;
import com.wuan.mango.core.service.CurdService;

/**
 * 字典管理
 * @author gaoxiang
 * @date 2020/01/23
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
