package com.baekjoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestController19 {
	
	
	// 팩토리얼 함수 : 조합 0의 개수
	// 2004문제
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(N);
		System.out.println(M);
		int count5 = five_power_n(N) - five_power_n(N-M) - five_power_n(M);
		int count2 = two_power_n(N) - two_power_n(N-M) - two_power_n(M);
		
		System.out.println(Math.min(count5, count2));
		
	}
	
	
	// 5의 승수를 구하는 함수
	static int five_power_n(int num) {
		int count = 0;
		
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		
		return count;
	}
	
	
	// 2의 승수를 구하는 함수
	static int two_power_n(int num) {
		int count = 0;
		
		while (num >= 2) {
			count += num / 2;
			num /= 2;
		}
		
		return count;
	}
}

