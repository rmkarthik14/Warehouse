package com.rmk.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.rmk.webapp.model.Location;

public interface LocationRepo extends CrudRepository<Location, Integer> {

}
