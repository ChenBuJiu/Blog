package com.alo.offer;

import java.util.Scanner;

/**
 * 题目描述
把 M 个同样的苹果放在 N 个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
注意：5、1、1 和 1、5、1 是同一种分法，即顺序无关。
输入描述:
输入包含多组数据。

每组数据包含两个正整数 m和n（1≤m, n≤20）。
输出描述:
对应每组数据，输出一个整数k，表示有k种不同的分法。
示例1
输入

7 3
输出

8
 * @author Administrator
 *
 */
public class DpApple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(solve(m,n));
		sc.close();
	}
/**
 * 
 * @param m 苹果数
 * @param n 盘子数
 * @return
 */
	private static int solve(int m, int n) {
		// TODO Auto-generated method stub
		if(n==1||m==0) {
			return 1;
		}else if(m<n){
			return solve(m,m);
		}else {
			return solve(m-n,n)+solve(m,n-1);
		}
	}
}
