package com.supratik.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.supratik.entities.Vendor;
@Component
public class VendorService {
	@Autowired
	IVendorPersistance vendor;
	
	public List<Vendor> getAllVendors() {
		return vendor.findAll();
	}
	
	public Vendor createVendor(Vendor vendorPayload) {
		return vendor.save(vendorPayload);
	}
	
	public Optional<Vendor> getVendorById(Long id) {
		return vendor.findById(id);
	}
	
	public List<Vendor> getVendorByComanyCode(String comanyCode) {
		return vendor.findBycomanyCode(comanyCode);
	}
	
	public Vendor changeVendor(Vendor vendorPayload) {
		return vendor.save(vendorPayload);
	}
	
	public String deleteVendor(Long vendorId) {
		vendor.deleteById(vendorId);
		Optional<Vendor> checkVendor = vendor.findById(vendorId);
		
		if (checkVendor.isPresent()) {
			return "Unable to Delete!";
		} else {
			return "Successfully deleted!";
		}
	}
		
}
