package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		for(int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
		
		//1
		//2
		//3
		//4
		
		
		
		sc.close();
	}
}
