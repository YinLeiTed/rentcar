package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.CarTable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarTableRepository  extends PagingAndSortingRepository<CarTable,Integer> {
    List<CarTable> findAllByIdCarStoreCarAndUsingCar(Integer idCarStoreCar,Integer usingCar);

    @Modifying
    @Query(value = "update car_table set using_car=?1 where id_car=?2", nativeQuery = true)
    void updateUsingState(Integer state,Integer id);
}
