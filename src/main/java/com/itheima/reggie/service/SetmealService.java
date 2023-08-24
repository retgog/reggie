package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.pojo.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时保存菜品和套餐的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐。同时删除菜品和套餐的关联信息
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 修改套餐，同时修改菜品和套餐的关联信息
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);

    /**
     * 显示套餐 套餐和菜品关系
     * @param id
     * @return
     */
    public SetmealDto getByIdWithDish(Long id);
}

