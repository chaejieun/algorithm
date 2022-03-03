package com.baekjoon.test;

import java.util.Scanner;
import java.util.Stack;

public class TestController9 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  17299 
		// 오큰수 : A(i) 보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미, 없을 경우에 -1
		// 오등큰수 : A(i)의 오른쪽에 있으면서 F(A(i))보다 등장횟수가 큰 수 중에서 왼쪽에 있는 수
		System.out.println("[17299]");

		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		
		int[] a = new int[N];	
		int[] ans = new int[N];
		int[] freq = new int[1000001]; 	// 해당 숫자가 몇 번 나왔는지 기록해둘 배열
		
		
		for (int i =0; i < N; i++) {
			a[i] = sc.nextInt();
			freq[a[i]] += 1;
		}
		
		Stack<Integer> s = new Stack<>();
		
		for (int i=0; i<N; i++) {
			if ( s.isEmpty()) {
				s.push(i);
			}
			
			while (!s.isEmpty() && freq[a[s.peek()]] < freq[a[i]]) { // 스택 가장 윗 숫자와 해당 숫자 횟수 배열과 비교
				ans[s.pop()] = a[i];
			}
			s.push(i);
		}
		
		while (!s.empty()) {
			ans[s.pop()] = -1;
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}

