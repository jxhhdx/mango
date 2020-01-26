package com.wuan.mango.admin.service;

import java.util.List;

import com.wuan.mango.admin.model.SysDept;
import com.wuan.mango.core.service.CurdService;

/**
 * 机构管理
 * @author gaoxiang
 * @date 2020/01/23
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
