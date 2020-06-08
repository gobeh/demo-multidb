package com.multidb.demo.db2.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(schema = "public", name = "cheklist_nilai")
@Data
public class CheklistNilai implements Serializable {

    @Id
    @Column(name = "id", length = 10)
    private Long id;

    @Column(name = "isi", length = 30)
    private String isi;

    @Column(name = "keterangan", length = 50)
    private String keterangan;

}
