package com.lavanya;

public class TestLavanyaInheritance
{
	public static void main(String[] args) 
	{
		System.out.println("Rammohan asserts");
			Rammohan ob1=new Rammohan();
			ob1.assert1();
		System.out.println("properties belong to Chanakya");
	//	System.out.println("Chanakya asserts");
			Chanakya ob2=new Chanakya();
    		ob2.assert1();
			ob2.assert2();
		System.out.println("properties belong to Avinash");
	//	System.out.println("Avinash asserts");		
			Avinash ob3=new Avinash();
			ob3.assert3();
			ob3.assert2();
			ob3.assert1();
		System.out.println("properties belong to Arun");
	//	System.out.println("ArunSonAvi asserts");
			ArunSonAvi  ob4=new ArunSonAvi();
			ob4.assert4();
			ob4.assert3();
			ob4.assert2();
			ob4.assert1();
		System.out.println("properties belong to Sony");
	//	System.out.println("SonyDauChanu asserts");
			SonyDauChanu ob5=new SonyDauChanu();
			ob5.assert5();
			ob5.assert2();
			ob5.assert1();
		System.out.println("properties belong to Dathri");
		//System.out.println("DathriDauChanu asserts");
			DathriDauChanu ob6=new DathriDauChanu();
			ob6.assert5();
			ob6.assert2();
			ob6.assert1();
	
	}
}