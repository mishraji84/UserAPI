package org.example.test.factorydesignpattern;

public class Bike implements Vahan
{

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 80000;
	}

	@Override
	public String toString() {
		return "Bike [getPrice()=" + getPrice() + "]";
	}
	
}