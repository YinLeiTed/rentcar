package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.UserTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserTableRepository extends PagingAndSortingRepository<UserTable,Integer> {
    List<UserTable> findAllByPhoneUserAndPhoneUserIsNotNullOrEmailUserAndEmailUserIsNotNullOrIdcardUserAndIdcardUserIsNotNull(String phone, String email, String idcard);
    UserTable findByPhoneUserAndPhoneUserIsNotNull(String phone);
    UserTable findByEmailUserAndEmailUserIsNotNull(String email);
    UserTable findByIdcardUserAndIdcardUserIsNotNull(String idcard);

    @Query(value = "select COLUMN_NAME from information_schema.COLUMNS where table_name = ?1 and table_schema = ?2",nativeQuery = true)
    List<String> findAllTableColumnName(String tablename,String schema);

    @Query(value = "select TABLE_NAME from information_schema.TABLES where table_schema = ?1",nativeQuery = true)
    List<String> findAllTableName(String schema);
}
