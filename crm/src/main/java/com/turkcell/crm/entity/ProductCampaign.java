package com.turkcell.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_campaigns")
public class ProductCampaign {

    @EmbeddedId // composit PK belirtmek icin
    private ProductCampaignId id = new ProductCampaignId(); // id null olmasın diye

    @ManyToOne()
    @MapsId("productId") // CustomerNotificationId içerisindeki tanımlanma şekli
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne()
    @MapsId("campaignId")
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    @Column(name = "status")
    private String status;

}
