package com.app.service;

import java.util.List;

import com.app.model.OrderType;

public interface IOrderTypeService {
	public Integer saveOrderType(OrderType s);
	public void updateOrderType(OrderType s);
	public void deleteOrderType(Integer id);
	public OrderType getOneOrderType(Integer id);
	public List<OrderType> getAllOrderTypes();
}
