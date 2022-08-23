package com.supratik.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supratik.entities.Address;

public interface IAddressPersistance extends JpaRepository<Address, Long>{

}
