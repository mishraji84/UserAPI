package org.example.test.factorydesignpattern;

public class Truck implements Vahan{

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public String toString() {
		return "Truck [getPrice()=" + getPrice() + "]";
	}

	

}