package com.tnsif.collectionEx;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		//10,20,30,40,50
		
		Stack<Integer> obj=new Stack<>();
		//class objname=new class();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		System.out.println(obj);
		
		obj.pop();
		obj.pop();

		System.out.println(obj);

		
	}

}
