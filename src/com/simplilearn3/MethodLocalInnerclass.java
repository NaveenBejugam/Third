package com.simplilearn3;

public class MethodLocalInnerclass {
	
	public void display()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("Method from Inner Class");
			}
		}
		
		Inner inner=new Inner();
		inner.myMethod();
	}
	
	public static void main(String[] args) {
		
		MethodLocalInnerclass mlic=new MethodLocalInnerclass();
		mlic.display();
	}

}
