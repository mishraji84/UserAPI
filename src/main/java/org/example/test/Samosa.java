package org.example.test;

public class Samosa {
private static Samosa s;
private Samosa ()
{
	}
public static Samosa getSamosa()
{
if (s == null) 	
{
s= new Samosa();
}
return s;
}
	
}
