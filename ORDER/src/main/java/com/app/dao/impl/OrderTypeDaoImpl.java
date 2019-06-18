package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderTypeDao;
import com.app.model.OrderType;
@Repository
public class OrderTypeDaoImpl implements IOrderTypeDao {
	@Autowired
private HibernateTemplate ht;
	@Override
	public Integer saveOrderType(OrderType s) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(s);
	}

	@Override
	public void updateOrderType(OrderType s) {
		// TODO Auto-generated method stub
ht.update(s);
	}

	@Override
	public void deleteOrderType(Integer id) {
		// TODO Auto-generated method stub
ht.delete(new OrderType(id));
	}

	@Override
	public OrderType getOneOrderType(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(OrderType.class, id);
	}

	@Override
	public List<OrderType> getAllOrderTypes() {
		// TODO Auto-generated method stub
		return ht.loadAll(OrderType.class);
	}

}
