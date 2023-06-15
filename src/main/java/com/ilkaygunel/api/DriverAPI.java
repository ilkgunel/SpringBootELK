package com.ilkaygunel.api;

import com.ilkaygunel.documents.Driver;
import com.ilkaygunel.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/driver/2/{driverName}")
    public ResponseEntity<Driver> getDriverByIdAndReturnResponseEntity(@PathVariable(value = "driverName") final String driverName) {
        return new ResponseEntity<>(driverService.getDriverByName(driverName), HttpStatus.OK);
    }
}
