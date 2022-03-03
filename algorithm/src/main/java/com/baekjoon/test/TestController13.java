package com.baekjoon.test;

import java.util.Scanner;

public class TestController13 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  
		// 소수 찾아내기
		System.out.println("[1978]");

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 	// 입력받을 수
		int count = 0;			// 소수 카운트 
		
		for (int i=0; i < N; i++) {	// N만큼 반복

			Boolean bool = true;
			int num = sc.nextInt();
			
			if ( num < 2 ) {
				bool = false;
			} 
			for (int j = 2; j < num-1 ; j++) {
				if ( num % j == 0) {
					bool = false;
				}
			}
			
			if ( bool ) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}

