package com.systelab.spring.service.supplier.implementation;

import com.systelab.spring.model.Supplier;
import com.systelab.spring.service.supplier.SupplierService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImplementation implements SupplierService {

    @Override
    public List<Supplier> getSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(new Supplier("IBM"));
        suppliers.add(new Supplier("Whole foods"));
        suppliers.add(new Supplier("Apple"));
        return suppliers;
    }
}
