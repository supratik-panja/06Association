package com.supratik.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "LFA1")
public class Vendor {
	@Id
	@Column(name = "LIFNR", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long vendorId;
	@Column(name = "BUKRS")
	public String comanyCode;
	@Column(name = "CONTACT_NAME")
	public String contactName;
	@Column(name = "CONTACT_NUMBER")
	public String ContactNumber;
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name = "Vendor", referencedColumnName = "LIFNR")
	List<Address> address = new ArrayList<>();

	public Vendor() {

	}	

	public Vendor(Long vendorId, String comanyCode, String contactName, String contactNumber, List<Address> address) {
		super();
		this.vendorId = vendorId;
		this.comanyCode = comanyCode;
		this.contactName = contactName;
		ContactNumber = contactNumber;
		this.address = address;
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getComanyCode() {
		return comanyCode;
	}

	public void setComanyCode(String comanyCode) {
		this.comanyCode = comanyCode;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}	

}
