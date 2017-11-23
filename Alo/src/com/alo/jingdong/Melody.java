package com.alo.jingdong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 时间限制：2秒
空间限制：131072K
小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和, 例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6(其中||表示绝对值)。
现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,这一个是最小难度和的方案了。 
输入描述:
输入包括两行,第一行一个正整数n(1 ≤ n ≤ 2000) 第二行n个整数v[i](1 ≤ v[i] ≤ 10^6), 表示每个音调。


输出描述:
输出一个整数,表示小Q和牛博士演唱最小的难度和是多少。

输入例子1:
5
1 5 6 2 1

输出例子1:
3
 * @author Administrator
 *
 */

public class Melody {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []a = new int[n];
		double avg=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			avg+=a[i];
		}
		avg/=n;
		int l=0,r=0,m=0;
		int []tag = new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]<avg) {
				tag[i]=-1;
				l++;
			}else if(avg<a[i]) {
				tag[i]=1;
				r++;
			}else {
				m++;
			}
		}
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		if(l>=r) {
			 left = new ArrayList<Integer>();
			 right = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				if(tag[i]==0||tag[i]==-1) {
					left.add(a[i]);
				}else {
					right.add(a[i]);
				}
			}
		}else {
			 left = new ArrayList<Integer>();
			 right = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				if(tag[i]==0||tag[i]==1) {
					right.add(a[i]);
				}else {
					left.add(a[i]);
				}
			}
		}
		int rs=0;
		for(int i=1;i<left.size();i++) {
			int temp = Math.abs(left.get(i)-left.get(i-1));
			rs+=temp;
		}
		for(int i=1;i<right.size();i++) {
			int temp = Math.abs(right.get(i)-right.get(i-1));
			rs+=temp;
		}
		System.out.println(rs);
		sc.close();
	}
}
