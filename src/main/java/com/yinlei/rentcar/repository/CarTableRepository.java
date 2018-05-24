package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.CarTable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarTableRepository  extends PagingAndSortingRepository<CarTable,Integer> {
    List<CarTable> findAllByIdCarStoreCar(Integer idCarStoreCar);
}
