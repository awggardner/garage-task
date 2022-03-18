package com.qa.garage_task.entities;

public class Motorbike extends Vehicle {
	
	private int bikething;
	private String bikething2;
	private int bikething3;
	
	public Motorbike(int id, String model, String manufacturer, int bikething, String bikething2, int bikething3) {
	    super(id, model, manufacturer); 
	    this.bikething = bikething;
	    this.bikething2 = bikething2;
	    this.bikething3 = bikething3;

	}
	
	

	public int getBikething() {
		return bikething;
	}



	public void setBikething(int bikething) {
		this.bikething = bikething;
	}



	public String getBikething2() {
		return bikething2;
	}



	public void setBikething2(String bikething2) {
		this.bikething2 = bikething2;
	}



	public int getBikething3() {
		return bikething3;
	}



	public void setBikething3(int bikething3) {
		this.bikething3 = bikething3;
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
