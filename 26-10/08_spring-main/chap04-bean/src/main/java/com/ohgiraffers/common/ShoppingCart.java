package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private final List<Product> items;	//쇼핑카트에 담긴 상품들

	/* 기본적으로 생성자가 호출될 때 어레이리스트가 만들어질 수 있도록 해줌 */
	public ShoppingCart() {
		items = new ArrayList<>();
	}
	
	public void addItem(Product item) {
		items.add(item);
	}
	
	public List<Product> getItems() { return items; }
}
