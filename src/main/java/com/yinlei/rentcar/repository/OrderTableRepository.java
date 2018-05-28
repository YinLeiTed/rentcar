package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.OrderTable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface OrderTableRepository extends PagingAndSortingRepository<OrderTable,Integer> {
}
