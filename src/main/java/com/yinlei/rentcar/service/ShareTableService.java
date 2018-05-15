package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.ShareTable;
import com.yinlei.rentcar.repository.ShareTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ShareTableService {
    @Autowired
    private ShareTableRepository dao;
    private Optional<ShareTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(ShareTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public ShareTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<ShareTable> getAllByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit,new Sort(Sort.Direction.DESC,"idShare"));
        return dao.findAll(p);
    }
    public Page<ShareTable> getAllByPageAndUserId(int page, int limit,int userid) {
        Pageable p=PageRequest.of(page,limit,new Sort(Sort.Direction.DESC,"idShare"));
        return dao.findAllByIdUserShare(userid,p);
    }

    public void update(ShareTable u) {
        dao.save(u);
    }
}
