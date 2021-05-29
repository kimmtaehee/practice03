package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();	
		int s = 0;
		
		for(int i = 1; i<=n; i++) {
			s = s+i;
			if( i == n) {
				System.out.print(i);
			}
			else {
				System.out.print( i + "+");
			}
		}
		
		System.out.println();
		System.out.println("합계" + s);
		
		
		
		sc.close();
	}

}
