package com.baekjoon.test;

import java.util.Scanner;

public class TestController3 {
	
	public static void main(String[] args) {

		// 백준 알고리즘 1874
		System.out.println("출력되고 있나요3");

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] stack = new int[N];
		
		int idx = 0;
		int start = 0;
		
		
		while(N -- > 0) {
			int value = in.nextInt();
			
			if(value > start) {
				// start + 1부터 입력받은 value 까지 push를 한다.
				for(int i = start + 1; i <= value; i++) {
					stack[idx] = i;
					idx++;
					System.out.println("+");
				}
				start = value; 	// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화 
			}
			
			// top에 있는 원소가 입력받은 값과 같이 않은 경우  
			else if(stack[idx - 1] != value) {
					System.out.println("NO");
					return;
			}
			
			idx--;
			System.out.println("-");
		}
	}
}

