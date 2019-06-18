package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;

	@RequestMapping("/reg")
	public String showReg(@ModelAttribute ShipmentType shipmentType,ModelMap map)
	{
		map.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentType";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType,ModelMap map)
	{
		Integer id=service.saveShipmentType(shipmentType);
		String message="shipment "+id+" saved";
		map.addAttribute("msg",message);
		return "ShipmentType";
	}
	@RequestMapping("/all")
	public String getAllShipments(ModelMap map)
	{
		List<ShipmentType> obs=service.getAllShipmentTypes();
		map.addAttribute("list",obs);
		return "ShipmentTypeData";
	}
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam(value="id")Integer id,ModelMap map)
	{
//		delete row
		service.deleteShipmentType(id);
//		fetch new data
		List<ShipmentType> obs=service.getAllShipmentTypes();
//		send data to ui
		map.addAttribute("list",obs);
		map.addAttribute("msg","shipment Type '"+id+"' deleted successfully..");
		return "ShipmentTypeData";
	}
//	edit page
	@RequestMapping("/edit")
	public String ShowEdit(@RequestParam Integer id,ModelMap map)
	{
		ShipmentType s=service.getOneShipmentType(id);
		map.addAttribute("shipmentType",s);
		return "ShipmentTypeEdit";
	}
	@RequestMapping("/update")
	public String doUpdate(@ModelAttribute ShipmentType shipment,ModelMap map)
	{
		List<ShipmentType> s=service.getAllShipmentTypes();
		map.addAttribute("list",s);
		map.addAttribute("msg","shipment'"+shipment.getWid()+"' updated..");
		return "ShipmentTypeData";
	}
	@RequestMapping("/view")
	public String viewOneShipment(@RequestParam Integer id,ModelMap map)
	{
		ShipmentType s=service.getOneShipmentType(id);
		map.addAttribute("ob",s);
		return "ShipmentTypeViewOne";
	}
}
