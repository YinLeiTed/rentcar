package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.User_table_yinlei;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User_table_yinlei,Integer> {
    User_table_yinlei findByNameUser(String nameUser);
    List<User_table_yinlei> findAllByNameUser(String nameUser);
}
