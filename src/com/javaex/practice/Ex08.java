package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int x = 1; x<10; x++) {
			
			for(int y =2; y<10; y++){
				System.out.print(y + "*" + x + "=" + x*y +"\t");
				}
			System.out.println();
		}
		
		sc.close();

	}

}
