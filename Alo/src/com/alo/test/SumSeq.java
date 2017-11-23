package com.alo.test;

import java.util.Scanner;

/**
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来
输入描述:
每个测试输入包含2个整数,n和m
输出描述:
按每个组合的字典序排列输出,每行输出一种组合
示例1
输入

5 5
输出

1 4
2 3
5
 * @author Administrator
 *
 */
public class SumSeq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum =sc.nextInt();
		sc.close();
	}
}
