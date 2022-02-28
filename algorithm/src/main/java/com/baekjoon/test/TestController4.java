package com.baekjoon.test;

import java.util.Scanner;
import java.util.Stack;

public class TestController4 {
	
	public static void main(String[] args) {

		// 백준 알고리즘 1406
		System.out.println("출력되고 있나요4");

		Scanner in = new Scanner(System.in);
   	    Stack<String> stack = new Stack<String>();

		
		String text = in.nextLine();
		int count = in.nextInt();
		
		
		int length = text.length();
		int cursor = text.length();
		
		
		for (int i=0; i<length; i++) {
			stack.add(text.substring(i,i+1));
		}
		
		
		for (int i = 0; i < count; i++){
            String command = in.next();
            if (command.equals("L")){
                if (cursor == 0){
                    continue;
                }
                else{
                    cursor -= 1;
                }
            }
            else if (command.equals("D")){
                if (cursor == length){
                    continue;
                }
                else{
                    cursor += 1;
                }
            }
            else if (command.equals("B")){
                if (cursor == 0 || stack.empty()){
                    continue;
                }
                else{
                    stack.remove(cursor-1);
                    cursor -= 1;
                    length -= 1;
                }
            }
            else if (command.equals("P")){
                String add = in.next();
                stack.add(cursor,add);
                cursor += 1;
                length += 1;
            }
        }
		
		
	     for (int i = 0; i < length; i++){
	            System.out.print(stack.get(i));
	        }
		
	}
}

