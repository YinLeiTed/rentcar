package com.yinlei.rentcar.repository;

import com.yinlei.rentcar.bean.ShareTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ShareTableRepository extends PagingAndSortingRepository<ShareTable,Integer> {
    List<ShareTable> findAllByIdUserShare(Integer idShare);
    Page<ShareTable> findAllByIdUserShare(Integer idUserShare,Pageable pageable);
    List<ShareTable> findAllByIdOrderShare(Integer orderid);
}
