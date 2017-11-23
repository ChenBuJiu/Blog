package com.alo.thread;

import java.util.HashSet;

public class Data {
	static HashSet<Integer> set = null;
	static {
		 set = new HashSet<Integer>();
		for (int i = 0; i < 100; i++)
			set.add(i);
	}
	public static HashSet<Integer> getData() {
		return Data.set;
	}

}
