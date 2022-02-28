package com.baekjoon.test;

import java.util.LinkedList;
import java.util.Scanner;

public class TestController5 {
	
	public static void main(String[] args) {

		// 백준 알고리즘 (큐) 10845 
		System.out.println("[10845]");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		for (int i =0; i <num; i++) {
			String command = in.next();
			
			if(command.equals("push")) {
				int inputNum = in.nextInt();
				queue.add(inputNum);
			}else if ( command.equals("front")) {
				if(queue.isEmpty() || queue.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.println(queue.get(0));
				}
			}else if ( command.equals("back")) {
				if(queue.isEmpty() || queue.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.print(queue.get(queue.size()-1));
				}
			}else if( command.equals("pop")) {
				if(queue.isEmpty() || queue.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.println(queue.remove(0));
				}
			}else if( command.equals("size")) {
				System.out.println(queue.size());
			}else if ( command.equals("empty")) {
				System.out.println(queue.isEmpty() ? "1" : "0");
			}
		}
	}
}

