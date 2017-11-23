package com.alo.test;

import java.util.Scanner;

/**
 * 题目描述
	对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
	如果 X = 123，则rev(X) = 321;
	如果 X = 100，则rev(X) = 1.
	现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
	输入描述:
	输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开。
	输出描述:
	输出rev(rev(x) + rev(y))的值
	示例1
	输入
	
	123 100
	输出
	
	223
 * @author Administrator
 *
 */
public class RevNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[]= sc.nextLine().split(" ");
		System.out.println(rm(String.valueOf(Integer.parseInt(rm(str[0]))+Integer.parseInt(rm(str[1])))));
		sc.close();
	}
	public static String rm(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer mid = sb.reverse();
		int len = mid.length();
		int tag =0;
		for(int i=0;i<len;i++) {
			if(mid.charAt(i)=='0') tag++;
			else {
				break;
			}
		}
		return mid.substring(tag);
	}
}
