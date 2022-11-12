package com.tnsif.collectionEx;


import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {

		//10,20,30,40,50
		
		
		PriorityQueue<Integer> obj=new PriorityQueue<>();
		
		obj.add(10);
		obj.add(20);
		obj.add(40);
		obj.add(30);
		obj.add(15);

		System.out.println(obj);
		
		obj.remove();
		
	
		
		System.out.println(obj);

	
		
		

		
	}

}
