package com.alo.test;

import java.util.*;
/**
 * "cacccca",7,"aaacca",6
 * "1AB2345CD",9,"12345EF",7
	·µ»Ø£º4
 * @author Administrator
 *
 */
public class LongestSubstring {
    public int findLongest(String A, int n, String B, int m) {
        // write code here
        int t[][] = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else {
                	if(t[i][j-1]<=t[i-1][j]) {
                		t[i][j]=t[i-1][j];
                		
                	}else {
                		t[i][j]=t[i][j-1];
                	}
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return t[n][m];
    }
    public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
		int rs = ls.findLongest("1AB2345CD", 9, "12345EF", 7);
		System.out.println(rs);
	}
}