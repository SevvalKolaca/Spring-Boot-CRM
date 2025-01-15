package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<Employee> employees;

    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<RoleOperationClaims> roleOperationClaims;

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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<RoleOperationClaims> getRoleOperationClaims() {
        return roleOperationClaims;
    }

    public void setRoleOperationClaims(List<RoleOperationClaims> roleOperationClaims) {
        this.roleOperationClaims = roleOperationClaims;
    }
}
