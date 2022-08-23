package com.supratik.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.supratik.entities.Address;

@Component
public class AddressService {

	@Autowired
	IAddressPersistance address;
	
	public List<Address> getAllAddress() {
		return address.findAll();
	}
	
	public Address createAddress(Address createAddressPayload) {
		return address.save(createAddressPayload);
	}
}
