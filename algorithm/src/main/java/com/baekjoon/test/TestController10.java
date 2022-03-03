package com.baekjoon.test;

import java.util.Scanner;

public class TestController10 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  10430 
		// 나머지 
		System.out.println("[10430]");

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
	}
}

