package com.turkcell.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProductCampaignId implements Serializable {

    @Column(name="product_id")
    private Integer productId;

    @Column(name="campaign_id")
    private Integer campaignId;
}
