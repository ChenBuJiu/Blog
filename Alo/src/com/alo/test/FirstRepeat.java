package com.alo.test;

import java.util.HashSet;

public class FirstRepeat {
    public char findFirstRepeat(String A, int n) {
        // write code here
    	HashSet set = new HashSet<>();
    	for(char c:A.toCharArray()) {
    		if(set.contains(c)) return c;
    		set.add(c);
    	}
    	return ' ';
    }
}