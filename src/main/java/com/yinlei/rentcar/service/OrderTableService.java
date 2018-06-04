package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.OrderTable;
import com.yinlei.rentcar.repository.OrderTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderTableService {
    @Autowired
    private OrderTableRepository dao;
    private Optional<OrderTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(OrderTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public OrderTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<OrderTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page-1,limit,new Sort(Sort.Direction.DESC,"idOrder"));
        return dao.findAll(p);
    }

    public void update(OrderTable u) {
        dao.save(u);
    }

    public Iterable<OrderTable> getAll() {
        return dao.findAll(new Sort(Sort.Direction.ASC,"achieveOrder"));
    }

    public Page<OrderTable> findAllByIdUserOrderOrderByIdOrderDesc(Integer userid,int page, int limit){
        Pageable p=PageRequest.of(page,limit,new Sort(Sort.Direction.DESC,"idOrder"));
        return dao.findAllByIdUserOrderOrderByIdOrderDesc(userid,p);
    }

    public List<OrderTable> findAllByOrderIdOrder(String orderid){
        return dao.findAllByOrderIdOrder(orderid);
    }
}
