package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipment")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="Aid")
	private Integer wid;
	@Column(name="smode")
	private String sMode;
	@Column(name="scode")
	private String shipmentCode;
	@Column(name="senble")
	private String enableShipment;
	@Column(name="sgrade")
	private String sgrade;
	@Column(name="snote")
	private String note;
	public ShipmentType() {
		super();
	}
	public ShipmentType(Integer wid) {
		super();
		this.wid = wid;
	}
	public ShipmentType(Integer wid, String sMode, String shipmentCode, String enableShipment, String sgrade,
			String note) {
		super();
		this.wid = wid;
		this.sMode = sMode;
		this.shipmentCode = shipmentCode;
		this.enableShipment = enableShipment;
		this.sgrade = sgrade;
		this.note = note;
	}
	public String getsMode() {
		return sMode;
	}
	public void setsMode(String sMode) {
		this.sMode = sMode;
	}
	public String getShipmentCode() {
		return shipmentCode;
	}
	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}
	public String getEnableShipment() {
		return enableShipment;
	}
	public void setEnableShipment(String enableShipment) {
		this.enableShipment = enableShipment;
	}
	public String getSgrade() {
		return sgrade;
	}
	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	public Integer getWid()
	{
		return wid;
	}
	@Override
	public String toString() {
		return "ShipmentType [wid=" + wid + ", sMode=" + sMode + ", shipmentCode=" + shipmentCode + ", enableShipment="
				+ enableShipment + ", sgrade=" + sgrade + ", note=" + note + "]";
	}
	

}
