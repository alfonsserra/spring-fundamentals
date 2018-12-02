package com.systelab.spring.service.distributor.implementation;

import com.systelab.spring.model.Distributor;
import com.systelab.spring.service.distributor.DistributorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "worldwideDistributors")
public class DistributorServiceImplementation implements DistributorService {

    @Override
    public List<Distributor> getDistributors() {
        List<Distributor> distributors = new ArrayList<>();
        distributors.add(new Distributor("Amazon"));
        distributors.add(new Distributor("Alibaba"));
        distributors.add(new Distributor("Walmart"));
        distributors.add(new Distributor("Otto"));
        distributors.add(new Distributor("JD"));
        return distributors;
    }
}
