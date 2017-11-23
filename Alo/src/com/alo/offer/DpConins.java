package com.alo.offer;

import java.util.Scanner;

/**
 * 题目描述
考虑仅用1分、5分、10分、25分和50分这5种硬币支付某一个给定的金额。
例如需要支付11分钱，有一个1分和一个10分、一个1分和两个5分、六个1分和一个5分、十一个1分这4种方式。
请写一个程序，计算一个给定的金额有几种支付方式。
注：假定支付0元有1种方式。
输入描述:
输入包含多组数据。

每组数据包含一个正整数n（1≤n≤10000），即需要支付的金额。
输出描述:
对应每一组数据，输出一个正整数，表示替换方式的种数。
示例1
输入

11
26
输出

4
13
 * @author Administrator
 *
 */
public class DpConins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(resolve(n));
		}
		sc.close();
	}

	private static int resolve(int n) {
		// TODO Auto-generated method stub
		int []a = new int[n+1];
		int [] coins ={1,5,10,25,50};
		a[0]=1;
		for(int i=0;i<coins.length;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=coins[i]) {
					a[j]=a[j]+a[j-coins[i]];
				}
			}
		}
		return a[n];
	}
}
