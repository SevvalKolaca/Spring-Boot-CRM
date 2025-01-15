package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SegmentationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    // Customer tablosundaki eşleştirme işlemini burada da yapmalıyız

    // Liste çünkü bir kişinin bir segmentasyonu vardır ancak
    // bir segmentasyonda birden çok kişi olabilir !!!

    // @{BuClass}to{DiğerClass} hangi taraf çoksa o taraf MANY
    // bir segmentte birden çok müşteri olur fazla taraf müşteri

    // mappedBy : diğer entity'de bu entitiy'i temsil eden değişken ismi
    @OneToMany(mappedBy = "segmentationType")
    @JsonIgnore
    private List<Customer> customers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
