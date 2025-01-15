package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "subscription_packages")
public class SubscriptionPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private PlanType planType;

    @OneToMany(mappedBy = "subscriptionPackage")
    @JsonIgnore
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "subscriptionPackage")
    @JsonIgnore
    private List<SubscriptionPackageCampaign> subscriptionPackagesCampaigns;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<SubscriptionPackageCampaign> getSubscriptionPackagesCampaigns() {
        return subscriptionPackagesCampaigns;
    }

    public void setSubscriptionPackagesCampaigns(List<SubscriptionPackageCampaign> subscriptionPackagesCampaigns) {
        this.subscriptionPackagesCampaigns = subscriptionPackagesCampaigns;
    }
}
