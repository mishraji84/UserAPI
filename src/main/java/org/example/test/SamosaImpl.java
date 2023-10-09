package org.example.test;

public class SamosaImpl {

	public static void main (String[] args)
	{
		Samosa s = Samosa.getSamosa();
		Samosa s1 = Samosa.getSamosa();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
	}
}
