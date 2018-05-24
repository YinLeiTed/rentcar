package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.BrandCarTable;
import com.yinlei.rentcar.repository.BrandCarTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class BrandCarTableService {
    @Autowired
    private BrandCarTableRepository dao;
    private Optional<BrandCarTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(BrandCarTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public BrandCarTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Iterable<BrandCarTable> getAll() {
        return dao.findAll();
    }

    public Page<BrandCarTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(BrandCarTable u) {
        dao.save(u);
    }
}
