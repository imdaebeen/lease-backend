package org.example.lease.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private LeaseContract contract;

    private double amount;
    private LocalDate paymentDate;
    private String status; // PAID, PENDING
}