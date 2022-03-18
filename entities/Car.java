package com.qa.garage_task.entities;

public class Car extends Vehicle {
	
	private int carthing;
	private String carthing2;
	private int carthing3;

	public Car(int id, String model, String manufacturer, int carthing, String carthing2, int carthing3) {
	    super(id, model, manufacturer); 
	    this.carthing = carthing;
	    this.carthing2 = carthing2;
	    this.carthing3 = carthing3;
	    
	    
	    

	}

	public int getCarthing() {
		return carthing;
	}

	public void setCarthing(int carthing) {
		this.carthing = carthing;
	}

	public String getCarthing2() {
		return carthing2;
	}

	public void setCarthing2(String carthing2) {
		this.carthing2 = carthing2;
	}

	public int getCarthing3() {
		return carthing3;
	}

	public void setCarthing3(int carthing3) {
		this.carthing3 = carthing3;
	}

	@Override
	public void add(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}
	
}
