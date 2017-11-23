package com.alo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyCom {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("ab");
		list.add("a");
		list.add("12");
		list.add("b");
		list.add("ba");
		list.add("");
		Collections.sort(list);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
	}
	
}
