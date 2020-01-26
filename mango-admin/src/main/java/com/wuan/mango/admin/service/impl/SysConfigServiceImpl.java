package com.wuan.mango.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuan.mango.admin.dao.SysConfigMapper;
import com.wuan.mango.admin.model.SysConfig;
import com.wuan.mango.admin.service.SysConfigService;
import com.wuan.mango.core.page.MybatisPageHelper;
import com.wuan.mango.core.page.PageRequest;
import com.wuan.mango.core.page.PageResult;

@Service
public class SysConfigServiceImpl  implements SysConfigService {

	@Autowired
	private SysConfigMapper sysConfigMapper;

	@Override
	public int save(SysConfig record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysConfigMapper.insertSelective(record);
		}
		return sysConfigMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysConfig record) {
		return sysConfigMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysConfig> records) {
		for(SysConfig record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysConfig findById(Long id) {
		return sysConfigMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		Object label = pageRequest.getParam("label");
		if(label != null) {
			return MybatisPageHelper.findPage(pageRequest, sysConfigMapper, "findPageByLabel", label);
		}
		return MybatisPageHelper.findPage(pageRequest, sysConfigMapper);
	}

	@Override
	public List<SysConfig> findByLable(String lable) {
		return sysConfigMapper.findByLable(lable);
	}

}
