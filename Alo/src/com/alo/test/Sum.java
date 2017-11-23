package com.alo.test;

import java.util.Scanner;

/**
 * 给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
	当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
	输入描述:
	输入为两行:
	
	第一行为两个正整数n(1 ≤ n ≤ 1000)，sum(1 ≤ sum ≤ 1000)
	
	第二行为n个正整数A[i](32位整数)，以空格隔开。
	输出描述:
	输出所求的方案数
	示例1
	输入
	
	5 15
	5 5 10 2 3
	输出
	
	4
 * @author Administrator
 *
 */
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum =sc.nextInt();
		int []a =new int[n+1];
		for(int i=1;i<=n;i++) a[i]=sc.nextInt();
		sc.close();
		long [][]dp=new long[n+1][sum+1];
		dp[0][0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				if(j>=a[i]) {
					 dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i]];//没有添加i之前的种数，添加了i的种数之和
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][sum]);
	}
}
