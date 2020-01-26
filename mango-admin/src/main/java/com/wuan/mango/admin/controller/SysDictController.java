package com.wuan.mango.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wuan.mango.admin.model.SysDict;
import com.wuan.mango.admin.service.SysDictService;
import com.wuan.mango.core.http.HttpResult;
import com.wuan.mango.core.page.PageRequest;

/**
 * 字典控制器
 * @author gaoxiang
 * @date 2020/01/23
 */
@RestController
@RequestMapping("dict")
public class SysDictController {

	@Autowired
	private SysDictService sysDictService;

	/**
	 * 保存字典记录
	 * @param record
	 * @return
	 */
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysDict record) {
		return HttpResult.ok(sysDictService.save(record));
	}

	/**
	 * 删除字典记录
	 * @param records
	 * @return
	 */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysDict> records) {
		return HttpResult.ok(sysDictService.delete(records));
	}

	/**
	 * 分页查询
	 * @param pageRequest
	 * @return
	 */
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysDictService.findPage(pageRequest));
	}

	/**
	 * 根据标签查询
	 * @param lable
	 * @return
	 */
	@GetMapping(value="/findByLable")
	public HttpResult findByLable(@RequestParam String lable) {
		return HttpResult.ok(sysDictService.findByLable(lable));
	}
}
