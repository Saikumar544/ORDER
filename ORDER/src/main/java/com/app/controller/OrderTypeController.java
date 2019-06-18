package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.OrderType;
import com.app.service.IOrderTypeService;

@Controller
@RequestMapping("/order")
public class OrderTypeController {
	@Autowired
	private IOrderTypeService service;
	@RequestMapping("/show")
public String show( @ModelAttribute OrderType order,ModelMap map)
{
		map.addAttribute("orderType",new OrderType());
	return "OrderType";
}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveOrderType(@ModelAttribute OrderType order,ModelMap map)
	{
	map.addAttribute("orderType",new OrderType());
		Integer id=service.saveOrderType(order);
		String message="saved succesfully..'"+id+"'..thanks for using my website";
		map.addAttribute("msg",message);
		map.addAttribute("orderType",new OrderType());
		return "OrderType";
	}
	@RequestMapping("/all")
	public String getAllOrderTypes(ModelMap map)
	{
		List<OrderType> list=service.getAllOrderTypes();
		map.addAttribute("list",list);
		return "OrderTypeData";
	}
	@RequestMapping("/edit")
	public String editOne(@RequestParam  Integer id , ModelMap map)
	{
	OrderType s=service.getOneOrderType(id);
map.addAttribute("orderType",s);
		return "OrderTypeEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute OrderType order,ModelMap map)
	{
		service.updateOrderType(order);
		List<OrderType> list=service.getAllOrderTypes();
		map.addAttribute("list",list);
		map.addAttribute("msg","Order '"+order.getId()+"' updated successfully..");
		return "OrderTypeData";
	}
	@RequestMapping("/delete")
	public String deleteOrderType(@RequestParam Integer id,ModelMap map)
	{
		service.deleteOrderType(id);
		List<OrderType> order=service.getAllOrderTypes();
		map.addAttribute("list",order);
		return "OrderTypeData";
	}
	@RequestMapping("/view")
	public String viewOneOrderTyep(@RequestParam Integer id,ModelMap map)
	{
		OrderType o=service.getOneOrderType(id);
		map.addAttribute("ob",o);
		return "OrderTypeView";
	}
}
