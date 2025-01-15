package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity // bir orm entitysi olduğunu belirtir yani bir tablo demek
@Table(name = "customers") // orm bu classı dbdeki customers tablosu ile eşleştirmeyi dener
public class Customer {

    @Id // primary key olarak işaretledik
    @GeneratedValue(strategy = GenerationType.IDENTITY) // otomatik olarak oluştuulan id demek
    @Column(name="id") // tablodaki sütun adı ile  koddaki değişken aynıysa sütun adı belirtmeye gerek kalmaz
    private Integer id;

    @Column(name="address")
    private String address;

    @Column(name="phone_number")
    private String phoneNumber;

    // iliskiler temsil edilirken FK alan temsil edilmez, yerine;
    @ManyToOne()
    @JoinColumn(name="segmentation_id")
    private SegmentationType segmentationType;

    @OneToOne (mappedBy = "customer")
    private IndividualCustomer individualCustomer;

    @OneToOne (mappedBy = "customer")
    private CorporateCustomer corporateCustomer;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<CustomerNotification> customerNotifications;

    // getter setter -------------------------------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SegmentationType getSegmentationType() {
        return segmentationType;
    }

    public void setSegmentationType(SegmentationType segmentationType) {
        this.segmentationType = segmentationType;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public CorporateCustomer getCorporateCustomer() {
        return corporateCustomer;
    }

    public void setCorporateCustomer(CorporateCustomer corporateCustomer) {
        this.corporateCustomer = corporateCustomer;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<CustomerNotification> getCustomerNotifications() {
        return customerNotifications;
    }

    public void setCustomerNotifications(List<CustomerNotification> customerNotifications) {
        this.customerNotifications = customerNotifications;
    }
}
