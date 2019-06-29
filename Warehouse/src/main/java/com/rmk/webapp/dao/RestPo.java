package com.rmk.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rmk.webapp.model.PurchaseOrder;

public interface RestPo extends JpaRepository<PurchaseOrder, Integer>{

}
