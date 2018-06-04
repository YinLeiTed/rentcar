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

    @Query(value = "select a.* from car_table a,order_table b where b.id_order in(?1) and a.id_car=b.id_car_order order by a.id_car desc",nativeQuery = true)
    List<CarTable> findCarByOrder(List<Integer> idOrderShare);

    List<CarTable> findAllByLicenseCar(String license);
}
