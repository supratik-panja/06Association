package com.supratik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.supratik.entities.Address;
import com.supratik.services.AddressService;

@RestController
public class AddressController {
	@Autowired
	AddressService address;
	
	@RequestMapping("/address")
	public List<Address> getAllAddress() {
		return address.getAllAddress();
	}
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address createAddressPayload) {
		return address.createAddress(createAddressPayload);
	}
}
