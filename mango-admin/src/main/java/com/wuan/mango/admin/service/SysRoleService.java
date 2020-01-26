package com.wuan.mango.admin.service;

import java.util.List;

import com.wuan.mango.admin.model.SysMenu;
import com.wuan.mango.admin.model.SysRole;
import com.wuan.mango.admin.model.SysRoleMenu;
import com.wuan.mango.core.service.CurdService;

/**
 * 角色管理
 * @author gaoxiang
 * @date 2020/01/23
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
