package com.baekjoon.test;

import java.util.Scanner;
import java.util.Stack;

public class TestController8 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  17298 
		// 오큰수 : A(i) 보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미, 없을 경우에 -1
		// 오등큰수 : A(i)의 오른쪽에 있으면서 F(A(i))보다 등장횟수가 큰 수 중에서 왼쪽에 있는 수
		System.out.println("[17298]");

		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		
		int[] seq = new int[N];	
		int[] ans = new int[N];
		
		
		for (int i =0; i < N; i++) {
			seq[i] = sc.nextInt();
		}
		
		Stack<Integer> s = new Stack<>();
		s.push(0); 	// 초기
		
		
		for (int i=1; i<N; i++) {
			if ( s.isEmpty()) {
				s.push(i);
			}
			
			// 스택이 비어있지 않고 
			// 현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우 
			// 해당 조건을 만족할 때 까지 stack의 원소를 pop 하면서
			// 해당 인덱스의 값을 현재 원소로 봐준다
			while (!s.isEmpty() && seq[s.peek()] < seq[i]) {
				ans[s.pop()] = seq[i];
			}
			s.push(i);
		}
		
		while (!s.empty()) {
			ans[s.pop()] = -1;
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(ans[i]);
		}
	}
}

