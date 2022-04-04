package com.baekjoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestController18 {
	
	
	// 팩토리얼 함수 : 팩토리얼 0의 개수
	// 1676문제
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		
		
		int count = 0;
		
		while ( num >= 5) {
			count += num / 5;
			num /= 5;
		}
		
		System.out.print(count);
		
	}
}

