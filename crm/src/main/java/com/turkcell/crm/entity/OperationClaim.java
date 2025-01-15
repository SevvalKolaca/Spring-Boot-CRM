package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="operation_claims")
public class OperationClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "operationClaim")
    @JsonIgnore
    private List<RoleOperationClaims> roleOperationClaimsList;

    @OneToMany(mappedBy = "operationClaim")
    @JsonIgnore
    private List<EmployeeOperationClaim> employeeOperationClaims;

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

    public List<RoleOperationClaims> getRoleOperationClaimsList() {
        return roleOperationClaimsList;
    }

    public void setRoleOperationClaimsList(List<RoleOperationClaims> roleOperationClaimsList) {
        this.roleOperationClaimsList = roleOperationClaimsList;
    }

    public List<EmployeeOperationClaim> getEmployeeOperationClaims() {
        return employeeOperationClaims;
    }

    public void setEmployeeOperationClaims(List<EmployeeOperationClaim> employeeOperationClaims) {
        this.employeeOperationClaims = employeeOperationClaims;
    }
}
