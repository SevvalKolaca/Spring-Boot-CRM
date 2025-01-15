package com.turkcell.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubscriptionPackageCampaignId implements Serializable{
    @Column(name="subscription_package_id")
    private Integer subscriptionPackageId;

    @Column(name="campaign_id")
    private Integer campaignId;

}
