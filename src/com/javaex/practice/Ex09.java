package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int x = 0; x<10; x++ ) {
			for(int y = 1; y<11; y++) {
				System.out.print( (x+y) + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		}
	}
