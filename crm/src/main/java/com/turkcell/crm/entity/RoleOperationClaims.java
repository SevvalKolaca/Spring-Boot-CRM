package com.turkcell.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name="role_operation_claims")
public class RoleOperationClaims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne()
    @JoinColumn(name="operation_claim_id")
    private OperationClaim operationClaim;

    @ManyToOne()
    @JoinColumn(name="role_id")
    private Role role;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
