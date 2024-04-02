package com.etiyacrm.customerservice.entities;

import com.etiyacrm.customerservice.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="email")
    private String email;

    @OneToOne(mappedBy = "customer")
    private IndividualCustomer individualCustomer;
}
