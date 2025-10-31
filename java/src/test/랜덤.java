package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class 랜덤 {
	
	public static void main(String[] args) {
		String[] students = {"안영아", "박희진", "양주영", "김경화", "조성진", "나승현", "전휘강", " 유지상", "최영우", "김현수", " 정성준", "이효미"};
		List<String> list = new LinkedList<String>( Arrays.asList(students) );
		
		Collections.shuffle(list);
		
		int count = 1;
		for (int i = 0; i < list.size(); i+=4) {
			int end = Math.min(i + 4, list.size());
			List<String> group = list.subList(i, end);
			System.out.println((count) + "조 : " + group);
			count++;
		}
	}

}
