package com.simplilearn3;

public class LocalInnerclass {
			
	void validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("Now Authenticate User using Adhar");
				}
			}
			
			Inner inner= new Inner();
			inner.test();
		}
		else
		{
			System.out.println("No need to Authenticate");
		}
	}
	
	public static void main(String[] args) 
	{
		LocalInnerclass local=new LocalInnerclass();
		local.validate(8);
	}

}
