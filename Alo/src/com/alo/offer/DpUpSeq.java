package com.alo.offer;

import java.util.Scanner;
/**
 * ´ý½â¾ö
 * @author Administrator
 *
 */
public class DpUpSeq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			int n = sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++) {
            	a[i]=sc.nextInt();
            }
			System.out.println(LCS(a));
		}
		sc.close();
	}

	public static int  LCS(int []a){
		int n=a.length;
		int [] dp = new int[n];
		for(int i=0;i<n;i++) dp[i]=1;
		int max=1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]>a[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
				if(max<dp[i]) max=dp[i];
			}
		}
		
		return max;
	}
}
