package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int s = 0;
		
		for(int i = 1; i<=n; i++) {
			if(n%2 == 0 & i%2==0) {
				s= s+i;
			}
			else if(n%2 == 1 & i%2==1) {
				s = s+i;
			}
		}
		
		System.out.println("결과값 : " + s);
		
		sc.close();


	}

}
