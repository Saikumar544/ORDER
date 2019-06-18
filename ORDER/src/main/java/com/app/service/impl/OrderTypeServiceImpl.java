package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderTypeDao;
import com.app.model.OrderType;
import com.app.service.IOrderTypeService;

@Service
public class OrderTypeServiceImpl implements IOrderTypeService{

	@Autowired
	private IOrderTypeDao dao;
	
	@Transactional
	public Integer saveOrderType(OrderType s) {
		// TODO Auto-generated method stub
		return dao.saveOrderType(s);
	}
@Transactional
	public void updateOrderType(OrderType s) {
		// TODO Auto-generated method stub
		dao.updateOrderType(s);
	}
@Transactional
	public void deleteOrderType(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteOrderType(id);
	}
@Transactional(readOnly=true)
	public OrderType getOneOrderType(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneOrderType(id);
	}
@Transactional(readOnly=true)
	public List<OrderType> getAllOrderTypes() {
		// TODO Auto-generated method stub
		return dao.getAllOrderTypes();
	}


}
