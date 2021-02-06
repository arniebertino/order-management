package com.neon.ordermanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ORDER_ENTITY")
public class OrderEntity {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    
    @Column(name="ITEM_NAME")
	private String itemName;
    
    @Column(name="ORDER_DATE")
	private Date orderDate;
    
//    @Column(name="DELIVERY_DATE")
//    private Date deliveryDate;
    
    public OrderEntity() {
    	
    }  
    
	public OrderEntity(String itemName, Date orderDate) {
		super();
		this.itemName = itemName;
		this.orderDate = orderDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
//	public Date getDeliveryDate() {
//		return deliveryDate;
//	}
//	public void setDeliveryDate(Date deliveryDate) {
//		this.deliveryDate = deliveryDate;
//	}
	

}
