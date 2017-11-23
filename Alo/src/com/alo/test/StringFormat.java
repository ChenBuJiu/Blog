package com.alo.test;

public class StringFormat {
    public String formatString(String A, int n, char[] arg, int m) {
        // write code here
    	int i=0;
    	while(i<arg.length) {
    		A.replaceFirst("%s", arg[i]+"");
    	}
    	return A;
    }
    
}