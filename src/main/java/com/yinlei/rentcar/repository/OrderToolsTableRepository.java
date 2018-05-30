package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.OrderToolsTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface OrderToolsTableRepository extends PagingAndSortingRepository<OrderToolsTable,Integer> {
    Page<OrderToolsTable> findAllByIdUserOrderAndStateOrderIsNotOrderByIdOrderDesc(Integer userid,String state,Pageable pageable);
}
