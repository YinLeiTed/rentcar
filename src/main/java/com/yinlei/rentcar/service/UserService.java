package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.User;
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
    private Optional<User> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(User u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public User getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public User getByName(String name) {
        return dao.findByName(name);
    }
    public List<User> getByNameLike(String name) {
        return dao.findAllByNameLike(name);
    }
    public List<User> getByAgeBetween(Integer age,Integer age2) {
        return dao.findAllByAgeBetween(age,age2);
    }
    public List<User> getAllByName(String name) {
        return dao.findAllByName(name);
    }

    public Page<User> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(User u) {
        dao.save(u);
    }
}
