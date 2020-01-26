package com.wuan.mall.dao;

import com.wuan.mall.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author gaoxiang
 * @date 2019/12/21
 */
//@Mapper
public interface CategoryMapper {

    /**
     * 查询
     * @param id 根据id进行查询
     * @return
     */
    @Select("select * from mall_category where id = #{id}")
    Category findById(@Param("id") Integer id);

    Category queryById(Integer id);
}
