package org.example.lease.controller;

import org.example.lease.model.LeaseContract;
import org.example.lease.service.LeaseContractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leases")
public class LeaseContractController {
    private final LeaseContractService service;

    public LeaseContractController(LeaseContractService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<LeaseContract> createContract(@RequestBody LeaseContract contract) {
        return ResponseEntity.ok(service.createContract(contract));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<LeaseContract> updateStatus(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(service.updateStatus(id, status));
    }
}