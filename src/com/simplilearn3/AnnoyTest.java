package com.simplilearn3;

public class AnnoyTest {
public static void main(String[] args) {
		
		Car c=new Car() {

			@Override
			public void start() {
				System.out.println("car started from anonymous class");
				
			}

			@Override
			public void stop() {
				System.out.println("car stoped from anonymous class");
				
			}
			
		};
		
		c.start();
		c.stop();
		
}
}
			
		
		





