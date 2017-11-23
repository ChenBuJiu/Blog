package com.alo.test;

public class AscentSequence {
    public int findLongest(int[] A, int n) {
        // write code here
    	int b[] = new int[n];
    	b[0]=A[0];
    	int end=0;
    	for(int i=1;i<n;i++) {
    		if(A[i]>b[end]) {
    			b[++end]=A[i];
    		}else {
    			int pos =binarySearch(b,0,end,A[i]);
    			b[pos] =A[i];
    		}
    	}
    	return end+1;
    }
    private int binarySearch(int []b,int begin,int end,int k) {
    	int mid =0;
    	while(begin<end) {
    		mid = begin+(end-begin)/2;
    		if(b[mid]==k) {
    			return mid;
    		}else if(b[mid]>k){
    			end=mid;
    		}else {
    			begin=mid+1;
    		}
    	}
    	return begin;
    }
}