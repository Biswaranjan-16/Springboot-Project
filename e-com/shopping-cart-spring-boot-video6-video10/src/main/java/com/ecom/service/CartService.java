package com.ecom.service;

import java.util.List;

import com.ecom.model.Cart;

public interface CartService {
	public Cart saveCart(Integer productId, Integer userId);

	public List<Cart> getCartsByUser(Integer userId);

	public void updateQuantity(String sy, Integer cid);

	public Integer getCountCart(Integer id);
}
