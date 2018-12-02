package com.systelab.spring;

import com.systelab.spring.service.supplier.SupplierService;
import com.systelab.spring.service.supplier.implementation.ChineseSupplierServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SupplierService supplierService() {
        return new ChineseSupplierServiceImplementation();
    }

}