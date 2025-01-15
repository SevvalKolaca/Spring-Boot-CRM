package com.turkcell.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_operation_claims")
public class EmployeeOperationClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "operation_claim_id")
    private OperationClaim operationClaim;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OperationClaim getOperationClaim() {
        return operationClaim;
    }

    public void setOperationClaim(OperationClaim operationClaim) {
        this.operationClaim = operationClaim;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
