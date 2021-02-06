package com.neon.ordermanagement.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.ordermanagement.entity.OrderEntity;
import com.neon.ordermanagement.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<OrderEntity> getOrders(){
		List<OrderEntity> orders = orderRepository.findAll();
		return orders;
	}

	public Long getCount() {
		Long count = orderRepository.count();
		return count;
	}
	

}
