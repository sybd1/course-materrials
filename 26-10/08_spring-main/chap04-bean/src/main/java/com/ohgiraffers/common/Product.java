package com.ohgiraffers.common;


/* 추상클래스이기 때문에 생성자가 있긴 하지만 생성자를 직접 외부에서 호출하여 인스턴스를 만들수 없다. */
public abstract class Product {
	
	private String name;	//상품명
	private int price;		//상품가격
	
	public Product() {}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}
}
