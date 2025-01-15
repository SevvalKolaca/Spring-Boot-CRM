package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "plan_types")
public class PlanType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "planType")
    @JsonIgnore
    private List<SubscriptionPackage> subscriptionPackages;

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

    public List<SubscriptionPackage> getSubscriptionPackages() {
        return subscriptionPackages;
    }

    public void setSubscriptionPackages(List<SubscriptionPackage> subscriptionPackages) {
        this.subscriptionPackages = subscriptionPackages;
    }
}
