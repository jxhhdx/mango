package com.wuan.mango.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuan.mango.admin.model.SysLog;
import com.wuan.mango.admin.service.SysLogService;
import com.wuan.mango.core.http.HttpResult;
import com.wuan.mango.core.page.PageRequest;

/**
 * 操作日志控制器
 * @author gaoxiang
 * @date 2020/01/23
 */
@RestController
@RequestMapping("log")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService;

	/**
	 * 登陆日志
	 * @param pageRequest
	 * @return
	 */
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLogService.findPage(pageRequest));
	}

	/**
	 * 删除操作日志
	 * @param records
	 * @return
	 */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLog> records) {
		return HttpResult.ok(sysLogService.delete(records));
	}
}
