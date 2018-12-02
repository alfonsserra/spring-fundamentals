package com.systelab.spring.service.distributor.implementation;

import com.systelab.spring.model.Distributor;
import com.systelab.spring.service.distributor.DistributorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "chineseDistributors")
public class ChineseDistributorServiceImplementation implements DistributorService {

    @Override
    public List<Distributor> getDistributors() {
        List<Distributor> distributors = new ArrayList<>();
        distributors.add(new Distributor("Alibaba"));
        distributors.add(new Distributor("GuoMei"));
        distributors.add(new Distributor("PinDuoDuo"));
        distributors.add(new Distributor("DangDang"));
        return distributors;
    }
}
