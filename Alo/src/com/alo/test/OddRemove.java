package com.alo.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目描述
对于一个由0..n的所有数按升序组成的序列，我们要进行一些筛选，每次我们取当前所有数字中从小到大的第奇数位个的数，并将其丢弃。重复这一过程直到最后剩下一个数。请求出最后剩下的数字。
输入描述:
每组数据一行一个数字，为题目中的n(n小于等于1000)。
输出描述:
一行输出最后剩下的数字。
示例1
输入

500
输出

255
 * @author Administrator
 *
 */
public class OddRemove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(rec(n));
		sc.close();
	}

	private static int rec(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<=n;i++) list.add(i);
		while(list.size()>1) {
			int i=1;
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			while(i<=list.size()-1) {
				temp.add(list.get(i));
				i=i+2;
			}
			list.clear();
			list.addAll(temp);
			
		}
		return list.get(0);
	}
}
