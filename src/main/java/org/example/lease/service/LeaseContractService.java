package org.example.lease.service;

import org.example.lease.model.LeaseContract;
import org.example.lease.repository.LeaseContractRepository;
import org.springframework.stereotype.Service;

@Service
public class LeaseContractService {
    private final LeaseContractRepository repository;

    public LeaseContractService(LeaseContractRepository repository) {
        this.repository = repository;
    }

    public LeaseContract createContract(LeaseContract contract) {
        contract.setStatus("PENDING");
        return repository.save(contract);
    }

    public LeaseContract updateStatus(Long id, String status) {
        LeaseContract contract = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contract not found"));
        contract.setStatus(status);
        return repository.save(contract);
    }
}