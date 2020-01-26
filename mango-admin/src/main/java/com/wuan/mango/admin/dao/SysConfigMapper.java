package com.wuan.mango.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuan.mango.admin.model.SysConfig;

/**
 * Demo class
 * 系统接口配置
 * @author gaoxiang
 * @date 2020/01/23
 */
public interface SysConfigMapper {
    /**
     * 根据主键删除数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);

    List<SysConfig> findPage();

    List<SysConfig> findPageByLabel(@Param(value="label") String label);

    List<SysConfig> findByLable(@Param(value="label") String label);
}