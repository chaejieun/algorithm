package com.baekjoon.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class TestController15 {
	// 카카오 코딩 테스트 연습 - 신고 결과 받기
	public int[] solution(String[] id_list, String[] report, int k) {
		
		 int[] answer = new int[id_list.length];
		 
		 // 신고한 사람을 저장
		 // key : 신고를 한 유저
		 // value : 신고한 유저들의 집합
		 HashMap<String, Set<String>> reporterArr = new HashMap<String, Set<String>>();
		 
		 // 신고 당한 사람
		 // key : 신고당한 유저
		 // value : 신고당한 횟수
		 HashMap<String, Integer> singoArr = new HashMap<String, Integer>();
		 
		 // 초기화
		 for (String id : id_list) {
			 singoArr.put(id, 0);
			 reporterArr.put(id, new HashSet<String>());
		 }
		 
		 // 신고된 사람들
		 for (String cur : report) {
			 StringTokenizer st = new StringTokenizer(cur, " ");
			 String reporter = st.nextToken();
			 String singo = st.nextToken();
			 
			 if ( reporterArr.get(reporter).add(singo)) {
				 singoArr.put(singo, singoArr.get(singo) + 1);
			 }
		 }
		 
         
		 // 신고한 사람
		 for ( String cur : report) {
			 StringTokenizer st = new StringTokenizer(cur, " ");
			 String reporter = st.nextToken();
			 String singo = st.nextToken();
			 if ( singoArr.get(singo) < k) {
				 reporterArr.get(reporter).remove(singo);
			 }
		 }

		 for (int i = 0 ; i < id_list.length; i++) {
			 answer[i] = reporterArr.get(id_list[i]).size();
		 }
		 
		 
		 return answer;
         
	}
}

