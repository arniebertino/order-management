package com.neon.ordermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.neon.ordermanagement.entity.OrderEntity;
import com.neon.ordermanagement.service.OrderService;
import com.neon.ordermanagement.service.UserService;
import com.neon.ordermanagement.bean.User;

@RestController
public class OrderManagement {
	
	@Autowired
	private OrderService orderService;

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ModelAndView showLoginPage(Model model) {
	    model.addAttribute("message", "Welcome to Order Management Application");
	    return new ModelAndView("welcome", "user", new User());
	}
	
	@PostMapping("/loginProcess")
	public ModelAndView processLoginPage(@ModelAttribute("user")User user, Model model) {
		

		ModelAndView mav=null;
		boolean val = userService.getuser(user);
		
				if(val==false) {
					model.addAttribute("message", "Username and password is wrong");
					mav= new ModelAndView("pdfreader", "user", new User());
				}
				else {
					Long count= orderService.getCount();
					model.addAttribute("message", "Total number of orders :"+count);
					mav= new ModelAndView("orderCount");
				}
    	
		return mav;
	}
	
	@GetMapping("/orderProcess")
	public ModelAndView processOrderDetails(Model model) {
		model.addAttribute("message", "Oder Details are displayed");
		
		List<OrderEntity> orders = orderService.getOrders();
				
		return new ModelAndView("orderDetails", "orders", orders);
	}
	
	
	
	

}
