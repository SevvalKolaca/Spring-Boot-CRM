package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProductServiceType productServiceType;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<OrderProduct> orderProducts;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<ProductCampaign> productCampaigns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ProductServiceType getProductServiceType() {
        return productServiceType;
    }

    public void setProductServiceType(ProductServiceType productServiceType) {
        this.productServiceType = productServiceType;
    }

    public List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public List<ProductCampaign> getProductCampaigns() {
        return productCampaigns;
    }

    public void setProductCampaigns(List<ProductCampaign> productCampaigns) {
        this.productCampaigns = productCampaigns;
    }
}
