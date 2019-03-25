package com.itheima.service;

import com.itheima.dao.IexcelDao;
import com.itheima.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExecelService implements IexcelService {
    @Autowired
    private IexcelDao dao;
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
