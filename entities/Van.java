package com.qa.garage_task.entities;

public class Van extends Vehicle {
	private int vanthing;
	private String vanthing2;
	private int vanthing3;
	
	public Van(int id, String model, String manufacturer, int vanthing, String vanthing2, int vanthing3) {
	    super(id, model, manufacturer); 
	    this.vanthing = vanthing;
	    this.vanthing2 = vanthing2;
	    this.vanthing3 = vanthing3;
	}


}
