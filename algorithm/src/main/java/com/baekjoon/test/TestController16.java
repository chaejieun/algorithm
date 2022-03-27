package com.baekjoon.test;


public class TestController16 {
	
	
	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		
		String answer = "";
		
		// 1단계
		new_id = new_id.toLowerCase();
		
		
		// 2단계
		String id = "";
		for (int i =0 ; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			}else if ( ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			}else if ( ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}
		
		
		// 3단계
		
		for (int i=0;i < id.length(); i++) {
			if ( id.charAt(i) == '.') {
				int j = i+1;
				String dot = ".";
				
				while (j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					j++;
				}
				
				if ( dot.length() > 1) {
					id = id.replace(dot, ".");
				}
			}
		}
		
		
		
		// 4단계
		if(id.startsWith(".")) {
			id = id.substring(1,id.length());
		}else if ( id.endsWith(".")) {
			id = id.substring(0,id.length()-1);
		}
		
		// 5단계
		if( id.length() == 0 ) {
			id += "a";
		}
		
		// 6단계
		if (id.length() >= 16) {
			id = id.substring(0,15);
		}
		
		if ( id.endsWith(".")) {
			id = id.substring(0,id.length()-1);
		}
		
		// 7단계
		String last = id.charAt(id.length()-1)+ "";
		if ( id.length() ==2) {
			id = id + last;
		}else if (id.length() == 1) {
			id = id + last + last ;
		}
		
        System.out.print(id);
	}
}

