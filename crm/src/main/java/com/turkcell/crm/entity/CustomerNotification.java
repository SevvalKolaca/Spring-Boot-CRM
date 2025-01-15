package com.turkcell.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_notifications")
public class CustomerNotification {

    @EmbeddedId // composit PK belirtmek icin
    private CustomerNotificationId id = new CustomerNotificationId(); // id null olmasın diye

    @ManyToOne()
    @MapsId("customerId") // CustomerNotificationId içerisindeki tanımlanma şekli
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne()
    @MapsId("notificationTypeId")
    @JoinColumn(name = "notification_type_id")
    private NotificationType notificationType;

    @Column(name = "status")
    private String status;

    public CustomerNotificationId getId() {
        return id;
    }

    public void setId(CustomerNotificationId id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
