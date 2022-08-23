package com.supratik.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.supratik.entities.Vendor;

public interface IVendorPersistance extends JpaRepository<Vendor, Long> {
	List<Vendor> findBycomanyCode(String comanyCode);
}
