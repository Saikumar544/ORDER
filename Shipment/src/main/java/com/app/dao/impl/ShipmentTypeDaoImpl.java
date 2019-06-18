package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao{
	@Autowired
	private HibernateTemplate ht;
	public Integer saveShipmentType(ShipmentType s) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(s);
	}

	public void updateShipmentType(ShipmentType s) {
		// TODO Auto-generated method stub
		ht.update(s);
	}

	public void deleteShipmentType(Integer id) {
		// TODO Auto-generated method stub
		ShipmentType a=new ShipmentType(id);
		ht.delete(a);
	}

	public ShipmentType getOneShipmentType(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(ShipmentType.class, id);
	}

	public List<ShipmentType> getAllShipmentTypes() {
		// TODO Auto-generated method stub
		return ht.loadAll(ShipmentType.class);
	}

}
