package com.wuan.mall;

import com.wuan.mall.dao.CategoryMapper;
import com.wuan.mall.dao.OrderMapper;
import com.wuan.mall.pojo.Category;
import com.wuan.mall.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryByIdTest() {
		Category category = categoryMapper.queryById(100001);
        System.out.println(category.toString());
    }
    @Test
    public void selectByPrimaryKey() {
        Order order = orderMapper.selectByPrimaryKey(1);
        System.out.println(order.toString());

    }


}
