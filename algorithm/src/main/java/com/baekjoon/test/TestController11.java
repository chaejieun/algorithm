package com.baekjoon.test;

import java.util.Scanner;

public class TestController11 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  2609
		// 최대공약수와 최소공배수
		System.out.println("[2609]");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int A = a;
		int B = b;
		
		// 최대공약수 
		while( b != 0){
			int r = a % b;
			a = b;
			b = r;
		}
		
		System.out.println(a);
		int g = a;
		
		
		// 최소공배수
		int l = g * ( A/g) * (B/g);
		System.out.println(l);
		
		
		
		
	}
}

