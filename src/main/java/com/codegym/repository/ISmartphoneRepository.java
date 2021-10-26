package com.codegym.repository;

import com.codegym.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends PagingAndSortingRepository<Smartphone, Long> {
    @Query(value = "select * from smartphones where producer = ?", nativeQuery = true)
    Page<Smartphone> findAllByProducer(String producer, Pageable pageable);
}
