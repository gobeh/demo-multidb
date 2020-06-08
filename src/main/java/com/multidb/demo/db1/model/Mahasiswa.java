package com.multidb.demo.db1.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(schema = "public", name = "mahasiswa")
@Data
public class Mahasiswa implements Serializable {

    @Id
    @Column(name = "id", length = 10)
    private Long id;

    @Column(name = "nim", length = 30)
    private String nim;

    @Column(name = "nama", length = 50)
    private String nama;

}
