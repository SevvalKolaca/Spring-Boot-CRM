package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "segmentation_id")
    private SegmentationType segmentationType;

    @OneToMany(mappedBy = "campaign")
    @JsonIgnore
    private List<SubscriptionPackageCampaign> subscriptionPackagesCampaigns;

    @OneToMany(mappedBy = "campaign")
    @JsonIgnore
    private List<ProductCampaign> productCampaigns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ProductCampaign> getProductCampaigns() {
        return productCampaigns;
    }

    public void setProductCampaigns(List<ProductCampaign> productCampaigns) {
        this.productCampaigns = productCampaigns;
    }

    public List<SubscriptionPackageCampaign> getSubscriptionPackagesCampaigns() {
        return subscriptionPackagesCampaigns;
    }

    public void setSubscriptionPackagesCampaigns(List<SubscriptionPackageCampaign> subscriptionPackagesCampaigns) {
        this.subscriptionPackagesCampaigns = subscriptionPackagesCampaigns;
    }

    public SegmentationType getSegmentationType() {
        return segmentationType;
    }

    public void setSegmentationType(SegmentationType segmentationType) {
        this.segmentationType = segmentationType;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
