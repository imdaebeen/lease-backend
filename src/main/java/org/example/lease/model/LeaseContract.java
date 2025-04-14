package org.example.lease.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class LeaseContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String vehicleModel;
    private double monthlyPayment;
    private int leaseTerm;
    private LocalDate startDate;
    private String status; // PENDING, APPROVED, REJECTED
}