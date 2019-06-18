package com.app.dao;

import java.util.List;

import com.app.model.OrderType;

public interface IOrderTypeDao {
	public Integer saveOrderType(OrderType s);
	public void updateOrderType(OrderType s);
	public void deleteOrderType(Integer id);
	public OrderType getOneOrderType(Integer id);
	public List<OrderType> getAllOrderTypes();
}
