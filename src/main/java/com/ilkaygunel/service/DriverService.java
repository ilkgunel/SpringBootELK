package com.ilkaygunel.service;

import com.ilkaygunel.documents.Driver;
import com.ilkaygunel.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    /*public Driver getDriverById(Long driverId) {
        return driverRepository.findById(driverId).get();
    }*/

    public Driver getDriverByName(String driverName) {
        return driverRepository.findByName(driverName);
    }

}
