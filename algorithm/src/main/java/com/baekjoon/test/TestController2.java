package com.baekjoon.test;

import java.util.LinkedList;
import java.util.Scanner;

public class TestController2 {
	
	public static void main(String[] args) {

		System.out.println("출력되고 있나요2");

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();	// N개의 개수
		int K = in.nextInt();	// K번째 삭제
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		for (int i=1; i<=N; i++) {
			list.add(i);
			
		}
		
		System.out.print("<");
		
		while (!list.isEmpty()) {
			
		
			for (int i=0; i< K; i++) {
				if( i == K-1) {
					int a = list.remove();
					if ( list.size() == 0 ) {
						System.out.print(a);
					}else {
						System.out.print(a+", ");
					}
				}else {
					list.add(list.remove());
				}
			}
		}
		System.out.print(">");
	}
}

