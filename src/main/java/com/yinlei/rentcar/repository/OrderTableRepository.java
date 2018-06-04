package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.OrderTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface OrderTableRepository extends PagingAndSortingRepository<OrderTable,Integer> {
    Page<OrderTable> findAllByIdUserOrderOrderByIdOrderDesc(Integer userid,Pageable pageable);
    List<OrderTable> findAllByOrderIdOrder(String orderid);
}
