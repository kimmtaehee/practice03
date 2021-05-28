package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//**
		//*
		//*
		//*
		//*
		
		sc.close();

	}

}
