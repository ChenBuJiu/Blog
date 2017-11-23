package com.alo.test;

public class LongestDistance {
    public int getDis(int[] A, int n) {
        // write code here
    	int max=0;
    	for(int i=1;i<n;i++) {
    		for(int j=i-1;j>=0;j--) {
    			if(A[i]-A[j]>max) {
    				max=A[i]-A[j];
    			}
    		}
    	
    	}
    	return max;
    }
}