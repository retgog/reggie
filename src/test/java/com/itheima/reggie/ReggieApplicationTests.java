package com.itheima.reggie;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.mapper.CategoryMapper;
import com.itheima.reggie.pojo.Category;
import com.itheima.reggie.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReggieApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    CategoryService categoryService;

    @Test
    public void test01(){
        Page<Category> page = new Page<>(2,3);
        categoryService.page(page,null);
        System.out.println(page);
    }


}
