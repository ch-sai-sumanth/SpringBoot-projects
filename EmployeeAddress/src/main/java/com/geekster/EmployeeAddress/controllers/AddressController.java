package com.geekster.EmployeeAddress.controllers;

import com.geekster.EmployeeAddress.models.Address;
import com.geekster.EmployeeAddress.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/addresses")
    public Iterable<Address> getAllAddresses()
    {
        return addressService.getAllAddresses();
    }

    @GetMapping("/addresses/{id}")
    public Optional<Address> getAddressById(@PathVariable int id)
    {
        return addressService.getAddressById(id);
    }

    @PostMapping("/addresses")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }

    @PutMapping("/addresses/{id}")
    public void updateAddressById(@RequestBody Address address,@PathVariable int id)
    {
        addressService.updateAddressById(address,id);
    }

    @DeleteMapping("/addresses/{id}")
    public void deleteAddressById(@PathVariable int id)
    {
        addressService.deleteAddressById(id);
    }
}
