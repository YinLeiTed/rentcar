package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.UserTable;
import com.yinlei.rentcar.repository.UserTableRepository;
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
public class UserTableService {
    @Autowired
    private UserTableRepository dao;
    private Optional<UserTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(UserTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public UserTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<UserTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page-1,limit,new Sort(Sort.Direction.DESC,"idUser"));
        return dao.findAll(p);
    }

    public void update(UserTable u) {
        dao.save(u);
    }

    public Integer existUser(UserTable u) {
        //System.out.println("\n\n"+dao.findAllByPhoneUserAndPhoneUserIsNotNullOrEmailUserAndEmailUserIsNotNullOrIdcardUserAndIdcardUserIsNotNull(u.getPhoneUser(),u.getEmailUser(),u.getIdcardUser()));
        return dao.findAllByPhoneUserAndPhoneUserIsNotNullOrEmailUserAndEmailUserIsNotNullOrIdcardUserAndIdcardUserIsNotNull(u.getPhoneUser(),u.getEmailUser(),u.getIdcardUser()).size();
    }
    public Integer existPhone(String phone) {
        if(dao.findByPhoneUserAndPhoneUserIsNotNull(phone)!=null)
            return 1;
        return 0;
    }
    public Integer existEmail(String email) {
        if(dao.findByEmailUserAndEmailUserIsNotNull(email)!=null)
            return 1;
        return 0;
    }
    public Integer existIdcard(String idcard) {
        if(dao.findByIdcardUserAndIdcardUserIsNotNull(idcard)!=null)
            return 1;
        return 0;
    }
    public UserTable login(UserTable u) {
        return dao.findAllByPhoneUserAndPhoneUserIsNotNullOrEmailUserAndEmailUserIsNotNullOrIdcardUserAndIdcardUserIsNotNull(u.getPhoneUser(),u.getEmailUser(),u.getIdcardUser()).get(0);
    }
    public List<UserTable> getUser(UserTable u) {
        return dao.findAllByPhoneUserAndPhoneUserIsNotNullOrEmailUserAndEmailUserIsNotNullOrIdcardUserAndIdcardUserIsNotNull(u.getPhoneUser(),u.getEmailUser(),u.getIdcardUser());
    }
    public List<String> findAllTableColumnName(String tablename,String schema){
        return dao.findAllTableColumnName(tablename,schema);
    }

    public List<String> findAllTableName(String schema){
        return dao.findAllTableName(schema);
    }
}
