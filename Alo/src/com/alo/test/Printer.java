package com.alo.test;

public class Printer {
    public int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
    	int []rs =new int[n*m];
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			for(int j=0;j<m;j++) {
    				rs[i*m+j]=mat[i][j];
    			}
    		}else {
    			for(int j=0;j<m;j++) {
    				rs[i*m+j]=mat[i][m-j-1];
    			}
    		}
    	}
    	return rs;
    }
}