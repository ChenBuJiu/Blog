package com.alo.test;

import java.util.*;
/**
 * "cacccca",7,"aaacca",6
 * "1AB2345CD",9,"12345EF",7
	·µ»Ø£º4
 * @author Administrator
 *
 */
public class LS {
    public int findLongest(String A, int n, String B, int m) {
        // write code here
        int t[][] = new int[n+1][m+1];
        int rs=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                    if(t[i][j]>rs)rs=t[i][j];
                }else {
                	t[i][j]=0;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return rs;
    }
    public static void main(String[] args) {
		LS ls = new LS();
		int rs = ls.findLongest("1AB2345CD", 9, "12345EF", 7);
		System.out.println(rs);
	}
}