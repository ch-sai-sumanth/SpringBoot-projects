package com.geekster.EmployeeAddress.services;

import com.geekster.EmployeeAddress.models.Address;
import com.geekster.EmployeeAddress.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepository iAddressRepository;
    public Iterable<Address> getAllAddresses()
    {
        return iAddressRepository.findAll();
    }

    public Optional<Address> getAddressById(int id) {
        return iAddressRepository.findById(id);
    }

    public void addAddress(Address address) {
        iAddressRepository.save(address);
    }

    public void updateAddressById(Address address, int id) {
        address.setAddressId(id);
        iAddressRepository.save(address);
    }

    public void deleteAddressById(int id) {
        iAddressRepository.deleteById(id);
    }
}
