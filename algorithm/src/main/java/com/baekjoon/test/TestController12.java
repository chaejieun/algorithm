package com.baekjoon.test;

import java.util.Scanner;

public class TestController12 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  
		// 소수 찾아내기
		// N이 소수가 되려면, 2보다 크거나 같고, N-1보다 작거나 같은 자연수로 나누어 떨어지면 안된다.
		System.out.println("[2609]");

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Boolean bool = true;
		
		if (N < 2 ) {
			System.out.print("false");
			bool = false;
		}
		
		for (int i=2; i<=N-1; i++) {
			if ( N % i == 0) {
				System.out.println("false");
				bool = false;
			}
		}
		if ( bool ) {
			System.out.println("true");
		}
	}
}

