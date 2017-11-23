package com.alo.test;

import java.util.Scanner;

/**
 * 给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
输入描述:
输入为一个数字N，即需要拼凑的面额
输出描述:
输出也是一个数字，为组成N的组合个数。
示例1
输入

5
输出

2
 * @author Administrator
 *
 */
public class ComboMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] a = {1,5,10,20,50,100};
		long []dp = new long[n+1];
		dp[0]=1;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=a[i]) {
					dp[j]+=dp[j-a[i]];
				}
			}
		}
		System.out.println(dp[n]);
		sc.close();
	}


}
