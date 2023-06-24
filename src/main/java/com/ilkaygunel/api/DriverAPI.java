package com.ilkaygunel.api;

import com.ilkaygunel.documents.Driver;
import com.ilkaygunel.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverAPI {

    private final DriverService driverService;

    public DriverAPI(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping(value = "/driver/{driverName}")
    @ResponseBody
    public Driver getDriverByName(@PathVariable(value = "driverName") final String driverName) {
        return driverService.getDriverByName(driverName);
    }

    @PostMapping(value = "/driver")
    public ResponseEntity<String> saveSingleDriver(@RequestBody Driver driver) {
        driverService.saveSingleDriver(driver);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Inserted!");
    }

    @PostMapping(value = "/drivers")
    public ResponseEntity<String> saveBulkDriver(@RequestBody List<Driver> drivers) {
        driverService.saveBulkDriver(drivers);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Inserted!");
    }

    @PutMapping(value = "/driver/{driverId}")
    public ResponseEntity<String> updateSingleDriver(@RequestBody Driver driver, @PathVariable(value = "driverId") final String driverId) {
        driverService.updateSingleDriver(driverId, driver);
        return ResponseEntity.status(HttpStatus.OK).body("Successfully Updated!");
    }

    @DeleteMapping(value = "/driver/{driverId}")
    public ResponseEntity<String> deleteSingleDriver(@PathVariable(value = "driverId") final String driverId) {
        driverService.deleteSingleDriver(driverId);
        return ResponseEntity.status(HttpStatus.OK).body("The driver with this id deleted:".concat(driverId));
    }

    @DeleteMapping(value = "/drivers")
    public ResponseEntity<String> deleteAllDrivers() {
        driverService.deleteAllDrivers();
        return ResponseEntity.status(HttpStatus.OK).body("All Drivers Deleted!");
    }

}
