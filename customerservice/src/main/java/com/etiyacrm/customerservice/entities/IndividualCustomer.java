package com.etiyacrm.customerservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="individual_customers")
@Data
public class IndividualCustomer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "nationality_id")
    private String nationalityId;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
