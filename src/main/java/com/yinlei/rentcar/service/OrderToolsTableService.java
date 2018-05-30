package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.OrderToolsTable;
import com.yinlei.rentcar.repository.OrderToolsTableRepository;
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
public class OrderToolsTableService {
    @Autowired
    private OrderToolsTableRepository dao;
    private Optional<OrderToolsTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(OrderToolsTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public OrderToolsTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<OrderToolsTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(OrderToolsTable u) {
        dao.save(u);
    }

    public Iterable<OrderToolsTable> getAll() {
        return dao.findAll(new Sort(Sort.Direction.ASC,"idOrder"));
    }

    public Page<OrderToolsTable> findAllByIdUserOrderOrderByIdOrderDesc(Integer userid, int page, int limit){
        Pageable p=PageRequest.of(page,limit,new Sort(Sort.Direction.DESC,"idOrder"));
        return dao.findAllByIdUserOrderAndStateOrderIsNotOrderByIdOrderDesc(userid,"已删除",p);
    }
}
