package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeDao dao;
	
	@Transactional
	public Integer saveShipmentType(ShipmentType s) {
		// TODO Auto-generated method stub
		return dao.saveShipmentType(s);
	}
@Transactional
	public void updateShipmentType(ShipmentType s) {
		// TODO Auto-generated method stub
		dao.updateShipmentType(s);
	}
@Transactional
	public void deleteShipmentType(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteShipmentType(id);
	}
@Transactional(readOnly=true)
	public ShipmentType getOneShipmentType(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneShipmentType(id);
	}
@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipmentTypes() {
		// TODO Auto-generated method stub
		return dao.getAllShipmentTypes();
	}

}
