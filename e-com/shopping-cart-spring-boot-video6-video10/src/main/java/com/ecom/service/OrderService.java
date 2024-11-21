package com.ecom.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ecom.model.OrderRequest;
import com.ecom.model.ProductOrder;
@Service
public interface OrderService {

	public List<ProductOrder> getOrdersByUser(Integer userId);
	
	void saveOrder(Integer userid, OrderRequest orderRequest);
	
	public ProductOrder updateOrderStatus(Integer id, String status);
	public List<ProductOrder> getAllOrders();
	public ProductOrder getOrdersByOrderId(String trim);
	
	//public Page<ProductOrder> getAllOrdersPagination(Integer pageNo,Integer pageSize);

	public Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize);
}