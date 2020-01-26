package com.wuan.mango.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wuan.mango.admin.model.SysConfig;
import com.wuan.mango.admin.service.SysConfigService;
import com.wuan.mango.core.http.HttpResult;
import com.wuan.mango.core.page.PageRequest;

/**
 * 系统配置控制器
 * @author gaoxiang
 * @date 2020/01/23
 */
@RestController
@RequestMapping("config")
public class SysConfigController {

	@Autowired
	private SysConfigService sysConfigService;

	/**
	 * 保存配置
	 * @param record
	 * @return
	 */
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysConfig record) {
		return HttpResult.ok(sysConfigService.save(record));
	}

	/**
	 * 删除记录
	 * @param records
	 * @return
	 */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysConfig> records) {
		return HttpResult.ok(sysConfigService.delete(records));
	}

	/**
	 * 分页查询
	 * @param pageRequest
	 * @return
	 */
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysConfigService.findPage(pageRequest));
	}

	/**
	 * 根据标签名称查询
	 * @param lable
	 * @return
	 */
	@GetMapping(value="/findByLable")
	public HttpResult findByLable(@RequestParam String lable) {
		return HttpResult.ok(sysConfigService.findByLable(lable));
	}
}
