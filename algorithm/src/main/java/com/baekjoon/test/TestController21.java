package com.baekjoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestController21 {
	
	// 숨바꼭질 17087번
	// 수빈이는 동생 N명과 숨바꼭질
	// 수빈이는 현재 S점에 있고
	// 동생은 A1, A2, ..., AN 있음
	// 모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자
	 static int gcd(int x, int y) {
	        if (y == 0) return x;
	        else return gcd(y, x%y);
	    }
	 
	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int S = sc.nextInt();
		
		int [] a  = new int[N];
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int diff = Math.abs(x-S);	// 절대값 반환 함수
			a[i] = diff;
		}

		int ans = a[0];
		for (int j = 1; j < N; j++) {
				ans = gcd(ans,a[j]);
		}
		System.out.print(ans);
	}
}

