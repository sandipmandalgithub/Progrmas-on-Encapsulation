package com.JavaBean;

//SETTER METHOD WILL ALAWAYS INITIALIZE THE DATA/ATTRIBUTES.
// THE ACCESS SPECIFIER & RETURN TYPE OF "SETTER()"IS ALAWAYS PUBLIC VOID

//GETTER METHOD WILL ALAWAYS RETURN THE DATA/ATTRIBUTES.
// THE RETURN TYPE OF "GETTER()" WILL CHANGE BASED ON THE DATA/ATTRIBUTES



public class Car {
	private String brand;

	public	void setBrand(String brand){
		this.brand=brand;
	}
	
	public String getBrand() {
		return brand;
	}


}
