package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		
		
		System.out.println("숫자 : ");
		int n1 = sc.nextInt();
		
		System.out.println("숫자 : ");
		int n2 = sc.nextInt();
		
		System.out.println("숫자 : ");
		int n3 = sc.nextInt();
		
		System.out.println("숫자 : ");
		int n4 = sc.nextInt();
		
		System.out.println("숫자 : ");
		int n5 = sc.nextInt();
		
		while (true) {
			if (n1>n2 && n1>n3 && n1>n4 && n1>n5) {
				System.out.println("최대값은 " + n1 + "입니다.");
				break;
			}
			else if (n2>n1 && n2>n3 && n2>n4 && n2>n5) {
				System.out.println("최대값은 " + n2 + "입니다.");
				break;
			}
			else if (n3>n1 && n3>n2 && n3>n4 && n3>n5) {
				System.out.println("최대값은 " + n3 + "입니다.");
				break;
			}
			else if (n4>n1 && n4>n2 && n4>n3 && n4>n5) {
				System.out.println("최대값은 "+ n4 +"입니다.");
				break;
			}
			else if (n5>n1 && n5>n2 && n5>n3 && n5>n4) {
				System.out.println("최대값은 " + n5 + "입니다.");
				break;
			}
		}
		
		
		//이거 말고 다른 방법이 있을거같은데 일단 이방식으로

		sc.close();
	}

}
