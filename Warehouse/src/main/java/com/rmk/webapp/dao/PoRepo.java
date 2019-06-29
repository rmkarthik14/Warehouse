package com.rmk.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rmk.webapp.model.PurchaseOrder;

public interface PoRepo extends CrudRepository<PurchaseOrder, Integer>{

}
