package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.CarTable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarTableRepository  extends PagingAndSortingRepository<CarTable,Integer> {
}
