package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
    User findByName(String name);
    List<User> findAllByName(String name);
    List<User> findAllByNameLike(String name);
    List<User> findAllByAgeBetween(Integer age, Integer age2);
}
