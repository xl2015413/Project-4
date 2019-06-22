package com.qphone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qphone.dao.OrdersMapper;
import com.qphone.pojo.Orders;
import com.qphone.service.OrdersService;
@Service("")
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersMapper ordersMapper;
	@Override
	public List<Orders> selectAll() {
		
		return ordersMapper.selectAll();
	}

}
