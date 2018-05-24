package com.yinlei.rentcar.service;


import com.yinlei.rentcar.bean.CarStoreTable;
import com.yinlei.rentcar.repository.CarStoreTableRepository;
import com.yinlei.rentcar.repository.LocationTableRepository;
import com.yinlei.rentcar.tools.MyLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class CarStoreTableService {
    @Autowired
    private CarStoreTableRepository dao;
    @Autowired
    private LocationTableRepository dao2;
    private Optional<CarStoreTable> u;

    public Long getCount(){
        return dao.count();
    }

    public void insert(CarStoreTable u) {
        dao.save(u);
    }

    public void delete(Integer id){
        dao.deleteById(id);
    }

    public CarStoreTable getById(Integer id) {
        u = dao.findById(id);
        if(u.isPresent())
        {
            return dao.findById(id).get();
        }
        return null;
    }

    public Page<CarStoreTable> getByPage(int page, int limit) {
        Pageable p=PageRequest.of(page,limit);
        return dao.findAll(p);
    }

    public void update(CarStoreTable u) {
        dao.save(u);
    }

    public Map getLocations(String address) {
        HashMap<String, Object> map=new HashMap<>();

        map.put("locations",MyLocation.alterLocations(dao2.findAllById(dao.findAllByAddressCarStore(address))));
        map.put("all",dao.findAllByAddressCarStoreLikeOrderByIdLocationCarStoreAsc("%"+address+"%"));
        return map;
    }
    public Map getCarStores(String address) {
        HashMap<String, Object> map=new HashMap<>();
        map.put("all",dao.findAllByAddressCarStoreLikeOrderByIdLocationCarStoreAsc("%"+address+"%"));
        return map;
    }
}
