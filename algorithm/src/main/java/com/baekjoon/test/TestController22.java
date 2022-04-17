package com.baekjoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestController22 {
	
	// 1373번
	// 2진수를 8진수로 변환 문제
	// 11001100 -> 314
	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String N = sc.nextLine();
		
		// 3자리 씩 끊었을 때, 한 자리만 남는 경우
		if (N.length() % 3 == 1) {
			sb.append(N.charAt(0));
		}
		
		// 3자리 씩 끊었을 때, 두 자리만 남는 경우
		if( N.length() % 3 == 2) {
			System.out.println(N.charAt(0) - '0');
			System.out.println((N.charAt(0) - '0')*2);
			sb.append((N.charAt(0) - '0')*2 + (N.charAt(1)-'0'));
		}
		
		for (int i = N.length() % 3; i < N.length(); i+= 3) {
			sb.append((N.charAt(i) -'0')*4 + (N.charAt(i+1)-'0')*2 + (N.charAt(i+2)-'0'));
		}
		
		System.out.println(sb);
	}
}

