package org.example.lease.repository;

import org.example.lease.model.LeaseContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseContractRepository extends JpaRepository<LeaseContract, Long> {
}
