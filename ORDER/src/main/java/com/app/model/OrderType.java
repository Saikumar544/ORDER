package com.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_table")
public class OrderType {
@Id
@GeneratedValue
@Column(name="oid")
private Integer id;
@Column(name="omode")
private String orderMode;
@Column(name="ocode")
private String orderCode;
@Column(name="otype")
private String orderTypes;
@Column(name="omaccpt")
@ElementCollection(fetch=FetchType.EAGER)
private List<String> accept;
@Column(name="notes")
private String description;
public OrderType() {
	super();
}
public OrderType(Integer id) {
	super();
	this.id = id;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getOrderMode() {
	return orderMode;
}
public void setOrderMode(String orderMode) {
	this.orderMode = orderMode;
}
public String getOrderCode() {
	return orderCode;
}
public void setOrderCode(String orderCode) {
	this.orderCode = orderCode;
}
public String getOrderTypes() {
	return orderTypes;
}
public void setOrderTypes(String orderTypes) {
	this.orderTypes = orderTypes;
}
public List<String> getAccept() {
	return accept;
}
public void setAccept(List<String> accept) {
	this.accept = accept;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "OrderType [id=" + id + ", orderMode=" + orderMode + ", orderCode=" + orderCode + ", orderTypes="
			+ orderTypes + ", accept=" + accept + ", description=" + description + "]";
}



}
