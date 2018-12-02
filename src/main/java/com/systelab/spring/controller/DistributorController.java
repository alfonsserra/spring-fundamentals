package com.systelab.spring.controller;

import com.systelab.spring.model.Distributor;
import com.systelab.spring.service.distributor.DistributorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization", allowCredentials = "true")
public class DistributorController {

    private DistributorService distributorService;

    @Resource(name = "worldwideDistributors")
    public void setDistributorService(DistributorService distributorService) {
        this.distributorService = distributorService;
    }

    @GetMapping("/distributors")
    public ResponseEntity<List<Distributor>> getAllDistributors() {
        return ResponseEntity.ok(distributorService.getDistributors());
    }
}