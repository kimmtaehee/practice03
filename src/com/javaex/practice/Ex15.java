package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
			System.out.println(i);
			}
		}
		
		sc.close();
	}

}
