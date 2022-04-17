package com.baekjoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestController23 {
	
	// 1212번
	// 8진수 -> 2진수 변환하는 프로그램 작성
	// 314
	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String N = sc.nextLine();
		
		int sum = 0;
		int len = N.length();
		
		for (int i = 0; i < N.length(); i++) {
			// 2진수 값을 구해주는 함수
			String a = Integer.toBinaryString(N.charAt(i)-'0');
			System.out.println(a.length());
			if( a.length() == 2 && i != 0) {
				a = "0" + a;
			}else if (a.length() == 1 && i != 0) {
				a = "00"+ a;
			}
			
			sb.append(a);
		}
		
		
		System.out.println(sb);
	}
}

