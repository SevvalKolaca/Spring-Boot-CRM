package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "payment_type_id")
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "invoice_type_id")
    private InvoiceType invoiceType;

    @OneToMany(mappedBy = "invoice")
    @JsonIgnore
    private List<OrderInvoice> orderInvoices;

    @OneToMany(mappedBy = "invoice")
    @JsonIgnore
    private List<SubscriptionInvoice> subscriptionInvoices;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }

    public List<OrderInvoice> getOrderInvoices() {
        return orderInvoices;
    }

    public void setOrderInvoices(List<OrderInvoice> orderInvoices) {
        this.orderInvoices = orderInvoices;
    }

    public List<SubscriptionInvoice> getSubscriptionInvoices() {
        return subscriptionInvoices;
    }

    public void setSubscriptionInvoices(List<SubscriptionInvoice> subscriptionInvoices) {
        this.subscriptionInvoices = subscriptionInvoices;
    }
}
