package com.wuan.mango.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuan.mango.admin.model.SysLoginLog;
import com.wuan.mango.admin.service.SysLoginLogService;
import com.wuan.mango.core.http.HttpResult;
import com.wuan.mango.core.page.PageRequest;

/**
 * 登录日志控制器
 * @author gaoxiang
 * @date 2020/01/23
 */
@RestController
@RequestMapping("loginlog")
public class SysLoginLogController {

	@Autowired
	private SysLoginLogService sysLoginLogService;

	/**
	 * 登陆日志分页拆查询
	 * @param pageRequest
	 * @return
	 */
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
	}

	/**
	 * 清除操作日志
	 * @param records
	 * @return
	 */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLoginLog> records) {
		return HttpResult.ok(sysLoginLogService.delete(records));
	}
}
