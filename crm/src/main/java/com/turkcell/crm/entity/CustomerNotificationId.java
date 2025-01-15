package com.turkcell.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CustomerNotificationId implements Serializable {
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "notification_type_id")
    private Integer notificationTypeId;
}