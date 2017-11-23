package com.alo.test;

import java.util.Scanner;

/**
 * 题目描述
一只袋鼠要从河这边跳到河对岸，河很宽，但是河中间打了很多桩子，每隔一米就有一个，每个桩子上都有一个弹簧，袋鼠跳到弹簧上就可以跳的更远。
每个弹簧力量不同，用一个数字代表它的力量，如果弹簧力量为5，就代表袋鼠下一跳最多能够跳5米，
如果为0，就会陷进去无法继续跳跃。河流一共N米宽，袋鼠初始位置就在第一个弹簧上面，
要跳到最后一个弹簧之后就算过河了，给定每个弹簧的力量，求袋鼠最少需要多少跳能够到达对岸。
如果无法到达输出-1
输入描述:
输入分两行，第一行是数组长度N (1 ≤ N ≤ 10000)，第二行是每一项的值，用空格分隔。
输出描述:
输出最少的跳数，无法到达输出-1
示例1
输入

5
2 0 1 1 1
输出

4
 * @author Administrator
 *
 */
public class DaiShu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		int []dp = new int[n];
		int []flag = new int[n];
		boolean tag= false;
		for(int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++ ) {
			if(a[i]>0)
			for(int j=1;j<=a[i];j++) {
				if(i+j<n) {
				if(a[i+j]>0&&flag[i+j]==0) {
					dp[i+j]=dp[i]+1 ;
					flag[i+j]=1;
				}}
				else {
					tag=true;
				}
			}
		}
		if(dp[n-1]==0) {
			System.out.println(-1);
		}else {
			if(tag) {
				System.out.println(dp[n-1]);
			}else {
				System.out.println(dp[n-1]+1);
			}
		}
		sc.close();
	}
}

