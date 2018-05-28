package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.OtherServiceTable;
import com.yinlei.rentcar.repository.OtherServiceTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class OtherServiceTableService {
    @Autowired
    private OtherServiceTableRepository dao;
    private Optional<OtherServiceTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(OtherServiceTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public OtherServiceTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<OtherServiceTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(OtherServiceTable u) {
        dao.save(u);
    }

    public Iterable<OtherServiceTable> getAll() {
        return dao.findAll();
    }
}
