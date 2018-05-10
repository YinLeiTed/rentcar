package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.UserTable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserTableRepository extends PagingAndSortingRepository<UserTable,Integer> {
    List<UserTable> findAllByPhoneUserAndPhoneUserIsNotNullOrEmailUserAndEmailUserIsNotNullOrIdcardUserAndIdcardUserIsNotNull(String phone, String email, String idcard);
    UserTable findByPhoneUserAndPhoneUserIsNotNull(String phone);
    UserTable findByEmailUserAndEmailUserIsNotNull(String email);
    UserTable findByIdcardUserAndIdcardUserIsNotNull(String idcard);
}
