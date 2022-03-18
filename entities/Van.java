package com.qa.garage_task.entities;

public class Van extends Vehicle {
	private int vanthing;
	private String vanthing2;
	private int vanthing3;
	
	public Van(int id, String model, String manufacturer, int vanthing, String vanthing2, int vanthing3) {
	    super(id, model, manufacturer); 
	    this.setVanthing(vanthing);
	    this.setVanthing2(vanthing2);
	    this.setVanthing3(vanthing3);
	}

	@Override
	public void add(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}
	
	public int getVanthing() {
		return vanthing;
	}

	public void setVanthing(int vanthing) {
		this.vanthing = vanthing;
	}

	public String getVanthing2() {
		return vanthing2;
	}

	public void setVanthing2(String vanthing2) {
		this.vanthing2 = vanthing2;
	}

	public int getVanthing3() {
		return vanthing3;
	}

	public void setVanthing3(int vanthing3) {
		this.vanthing3 = vanthing3;
	}




}
