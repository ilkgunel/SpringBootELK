package com.ilkaygunel.service;

import com.ilkaygunel.documents.Driver;
import com.ilkaygunel.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    public Driver getDriverByName(String driverName) {
        return driverRepository.findByName(driverName);
    }

    public Driver getDriverById(String id) {
        return driverRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no driver with this Id".concat(id)));
    }

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public void saveSingleDriver(Driver driver) {
        driver = driverRepository.save(driver);
    }

    public void saveBulkDriver(List<Driver> drivers) {
        driverRepository.saveAll(drivers);
    }

    public void updateSingleDriver(String driverId, Driver driverToUpdate) {
        Driver existingDriver = getDriverById(driverId);
        existingDriver.setName(driverToUpdate.getName());
        existingDriver.setSurname(driverToUpdate.getSurname());
        driverRepository.save(existingDriver);
    }

    public void deleteSingleDriver(String id) {
        driverRepository.deleteById(id);
    }

    public void deleteAllDrivers() {
        driverRepository.deleteAll();
    }

}
