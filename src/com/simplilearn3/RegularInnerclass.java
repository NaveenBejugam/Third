package com.simplilearn3;

public class RegularInnerclass {
	
private int a=10;
	
	class Inner
	{
		void display()
		{
			System.out.println("Welcome to Inner Class");
			System.out.println("value of a "+a);
		}
	}
	
	public static void main(String[] args) {
		
		RegularInnerclass outer=new RegularInnerclass();
		RegularInnerclass.Inner inner= outer.new Inner();
		
		inner.display();
	}

}
