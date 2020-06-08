package com.multidb.demo.controller;


import com.multidb.demo.db1.model.Mahasiswa;
import com.multidb.demo.db1.repository.MahasiswaRepository;
import com.multidb.demo.db2.model.CheklistNilai;
import com.multidb.demo.db2.repository.CheklistNilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {


    @Autowired
    MahasiswaRepository mahasiswaRepository;

    @Autowired
    CheklistNilaiRepository cheklistNilaiRepository;


    @GetMapping(value = "/api/mahasiswa", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Mahasiswa> testMahasiswa(@RequestHeader(required = true, value = HttpHeaders.ACCEPT_LANGUAGE) final String languageCode) {
        return mahasiswaRepository.findAll();
    }

    @GetMapping(value = "/api/cheklist_nilai", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<CheklistNilai> testCheklistNilai(@RequestHeader(required = true, value = HttpHeaders.ACCEPT_LANGUAGE) final String languageCode) {
        return cheklistNilaiRepository.findAll();
    }

}
