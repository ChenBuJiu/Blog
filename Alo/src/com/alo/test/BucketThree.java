package com.alo.test;

import java.util.Scanner;

/**
 * 题目描述
现在有一个数组，其值为从1到10000的连续增长的数字。出于某次偶然操作，导致这个数组中丢失了某三个元素，同时顺序被打乱，现在需要你用最快的方法找出丢失的这三个元素，并且将这三个元素根据从小到大重新拼接为一个新数字，计算其除以7的余数。 例：丢失的元素为336，10，8435，得到的新数字为103368435，除以七的余数为2。
输入描述:
输入数据为一行，包含9997个数字，空格隔开。
输出描述:
输出为一行，包含一个数字。
示例1
输入

同题设例子输入
输出

2
 * @author Administrator
 *
 */
public class BucketThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a= new int[10000];
		for(int i=0;i<9997;i++) {
			int index =sc.nextInt();
			a[index-1]=index;
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<10000;i++) {
			if(a[i]==0) {
				sb.append(i);
			}
		}
		System.out.println(Long.parseLong(sb.toString())%7);
		sc.close();
	}
}
