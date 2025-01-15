package com.turkcell.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subscription_package_campaigns")
public class SubscriptionPackageCampaign {
    @EmbeddedId
    private SubscriptionPackageCampaignId id = new SubscriptionPackageCampaignId();

    @ManyToOne()
    @MapsId("subscriptionPackageId")
    @JoinColumn(name = "subscription_package_id")
    private SubscriptionPackage subscriptionPackage;

    @ManyToOne()
    @MapsId("campaignId")
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    @Column(name = "status")
    private String status;

    public SubscriptionPackageCampaignId getId() {
        return id;
    }

    public void setId(SubscriptionPackageCampaignId id) {
        this.id = id;
    }

    public SubscriptionPackage getSubscriptionPackage() {
        return subscriptionPackage;
    }

    public void setSubscriptionPackage(SubscriptionPackage subscriptionPackage) {
        this.subscriptionPackage = subscriptionPackage;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
