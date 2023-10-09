package org.example.test.factorydesignpattern;

public class VahanFactory {

public static Vahan getVahan(String vahan) {
	if (vahan.equalsIgnoreCase("bike")) {return new Bike();}
	else if(vahan.equalsIgnoreCase("car")) {return new Car();}
	else if (vahan.equalsIgnoreCase("truck")) {return new Truck();}
	else return null;
}
}
