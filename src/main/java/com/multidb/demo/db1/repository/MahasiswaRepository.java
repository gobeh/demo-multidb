package com.multidb.demo.db1.repository;


import com.multidb.demo.db1.model.Mahasiswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MahasiswaRepository extends PagingAndSortingRepository<Mahasiswa, Long> {

}
