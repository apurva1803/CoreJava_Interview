package com.rays.methods;

public class Capacity {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Apurva");
		
		System.out.println(sb);
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
		System.out.println("=====================================");
		
		System.out.println(sb.append("Deshmukh"));
		
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
		System.out.println("=====================================");
		
		System.out.println(sb.append("Raut"));
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
//		Output: Apurva
//		length:6
//		capacity:22
//		=====================================
//		ApurvaDeshmukh
//		length:14
//		capacity:22
//		=====================================
//		ApurvaDeshmukhRaut
//		length:18
//		capacity:22
	}
}
