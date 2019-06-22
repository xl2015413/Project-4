package com.qphone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qphone.pojo.Orders;
import com.qphone.service.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	@RequestMapping("/orders")
	public List<Orders> selectAll(){
		List<Orders> list=ordersService.selectAll();
		return list;
	}
}
