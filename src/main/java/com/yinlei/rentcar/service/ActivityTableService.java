package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.ActivityTable;
import com.yinlei.rentcar.repository.ActivityTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ActivityTableService {
    @Autowired
    private ActivityTableRepository dao;
    private Optional<ActivityTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(ActivityTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public ActivityTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<ActivityTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(ActivityTable u) {
        dao.save(u);
    }

    public Iterable<ActivityTable> getAll() {
        return dao.findAll(new Sort(Sort.Direction.ASC,"achieveActivity"));
    }
}
