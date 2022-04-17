package com.baekjoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestController20 {
	
	public static int gcd (int x, int y) {
		if ( y == 0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	
	
	
	// 수학 연습 : GCD 합
	// 9613번
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		while (t-- > 0) {
			
			int n = sc.nextInt();
			int [] a  = new int[n];
			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			long ans =0;
			for (int i = 0; i <n-1; i++) {
				for (int j = i+1; j <n; j++) {
					ans += gcd(a[i],a[j]);
				}
			}
			
			 System.out.println(ans);
		}
	}
}
