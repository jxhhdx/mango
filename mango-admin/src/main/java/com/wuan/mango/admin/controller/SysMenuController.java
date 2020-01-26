package com.wuan.mango.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wuan.mango.admin.model.SysMenu;
import com.wuan.mango.admin.service.SysMenuService;
import com.wuan.mango.core.http.HttpResult;

/**
 * 菜单控制器
 * @author gaoxiang
 * @date 2020/01/23
 */
@RestController
@RequestMapping("menu")
public class SysMenuController {

	@Autowired
	private SysMenuService sysMenuService;

	/**
	 * 保存菜单记录
	 * @param record
	 * @return
	 */
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysMenu record) {
		return HttpResult.ok(sysMenuService.save(record));
	}

	/**
	 * 删除菜单记录
	 * @param records
	 * @return
	 */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysMenu> records) {
		return HttpResult.ok(sysMenuService.delete(records));
	}

	/**
	 * 查询导航菜单树
	 * @param userName
	 * @return
	 */
	@GetMapping(value="/findNavTree")
	public HttpResult findNavTree(@RequestParam String userName) {
		return HttpResult.ok(sysMenuService.findTree(userName, 1));
	}

	/**
	 * 查询菜单树
	 * @return
	 */
	@GetMapping(value="/findMenuTree")
	public HttpResult findMenuTree() {
		return HttpResult.ok(sysMenuService.findTree(null, 0));
	}
}
