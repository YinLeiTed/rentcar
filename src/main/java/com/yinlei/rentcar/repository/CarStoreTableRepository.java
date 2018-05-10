package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.CarStoreTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarStoreTableRepository extends PagingAndSortingRepository<CarStoreTable,Integer> {

    @Query(value = "SELECT id_location_car_store FROM car_store_table a where a.address_car_store like %:address% order by a.id_location_car_store", nativeQuery = true)
    List<Integer> findAllByAddressCarStore(@Param("address") String address);

    List<CarStoreTable> findAllByAddressCarStoreLikeOrderByIdLocationCarStoreAsc(String address);
}
