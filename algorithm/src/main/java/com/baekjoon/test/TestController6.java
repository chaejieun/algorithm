package com.baekjoon.test;

import java.util.Scanner;
import java.util.Stack;

public class TestController6 {
	
	
	public static void main(String[] args) {

		// 백준 알고리즘  17413 
		System.out.println("[17413]");

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		
		boolean tag = false;
		Stack<Character> s = new Stack<>();
		
		for (char ch : str.toCharArray() ) {
			
			if ( ch == '<') {	// '<' 태그 시작일 경우
				
				tag = true; // 태그 안
				
				while (!s.isEmpty()) { // 스택에 저장되어 있는 모든 것을 pop() 출력
					System.out.print(s.pop());
				}
				System.out.print(ch);	// '<' 출력
				
			}else if ( ch == '>') { 	// '>' 태그 닫을 경우
				tag = false;			
				System.out.print(ch);
				
			}else if ( tag ) {	// <> 안에 있을 경우, 그대로 출력해주기
				System.out.print(ch);
				
			}else if (!tag){	 // < > 밖에 있으면
				// 공백이라면 
				if ( ch == ' ') {
					// 스택에 저장되어 있는 모든 것을 pop() 출력
					while ( !s.isEmpty()) {
						System.out.print(s.pop());
					}
					System.out.print(ch);
				}else { // 공백이 아니면
					// 스택에 넣기
					s.push(ch);
				}
			}
		}
	}
}

