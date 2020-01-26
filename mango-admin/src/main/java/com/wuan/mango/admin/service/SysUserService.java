package com.wuan.mango.admin.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.wuan.mango.admin.model.SysUser;
import com.wuan.mango.admin.model.SysUserRole;
import com.wuan.mango.core.page.PageRequest;
import com.wuan.mango.core.service.CurdService;

/**
 * 用户管理
 * @author gaoxiang
 * @date 2020/01/23
 */
public interface SysUserService extends CurdService<SysUser> {

    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);

    /**
     * 查找用户的角色集合
     * @param userId
     * @return
     */
    List<SysUserRole> findUserRoles(Long userId);

    /**
     * 生成用户信息Excel文件
     * @param pageRequest 要导出的分页查询参数
     * @return
     */
    File createUserExcelFile(PageRequest pageRequest);

}
