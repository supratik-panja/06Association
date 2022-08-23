package com.supratik.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.supratik.entities.Vendor;
import com.supratik.services.VendorService;

@RestController
public class VendorController {
	@Autowired
	VendorService vendorService;
	
	@RequestMapping("/vendor")
	public List<Vendor> getAllVendors() {
		return vendorService.getAllVendors();
	}
	
	@RequestMapping("/vendor/{vendorId}") 
	public Optional<Vendor> getVendorById(@PathVariable Long vendorId) {
		return vendorService.getVendorById(vendorId);
	}
	
	@RequestMapping("/vendor/search")
	public List<Vendor> getVendorByCompanyCode(@RequestParam String companyCode) {
		return vendorService.getVendorByComanyCode(companyCode);
	}
	
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor createVendorPayload) {
		return vendorService.createVendor(createVendorPayload);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/vendor" )
	public Vendor changeVendor(@RequestBody Vendor changeVendorPayload) {
		return vendorService.changeVendor(changeVendorPayload);
	}
	
	@DeleteMapping("/vendor/delete/{vendorId}")
	public String deleteVendor(@PathVariable Long vendorId) {
		return vendorService.deleteVendor(vendorId);
	}
	
}
