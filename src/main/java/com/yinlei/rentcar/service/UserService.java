package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.User_table_yinlei;
import com.yinlei.rentcar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository dao;
    private Optional<User_table_yinlei> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(User_table_yinlei u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public User_table_yinlei getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public User_table_yinlei getByName(String name) {
        return dao.findByNameUser(name);
    }
    public List<User_table_yinlei> getAllByName(String name) {
        return dao.findAllByNameUser(name);
    }

    public Page<User_table_yinlei> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(User_table_yinlei u) {
        dao.save(u);
    }
}
