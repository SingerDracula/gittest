package com.itheima.dao;

import com.itheima.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IexcelDao {
    @Select("select * from excel")
    public List<User> findAll();
}
