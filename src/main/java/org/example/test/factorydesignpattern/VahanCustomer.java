package org.example.test.factorydesignpattern;

public class VahanCustomer {

	
	public static void main(String []args)
	{
		Vahan v = VahanFactory.getVahan("CAR");
		Vahan b = VahanFactory.getVahan("Bike");
		Vahan t = VahanFactory.getVahan("truck");
		System.out.println(v);
		System.out.println(b);
		System.out.println(t);
	}
	
}
