package com.alo.test;

import java.util.Scanner;

/**
 * 题目描述
	输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
	输入描述:
	每个测试输入包含2个字符串
	输出描述:
	输出删除后的字符串
	示例1
	输入
	
	They are students.
	aeiou
	输出
	
	Thy r stdnts.
 * @author Administrator
 *
 */
public class RmSame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ori =sc.nextLine();
		String del =sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ori.length();i++) {
			if(del.indexOf(ori.charAt(i))!=-1) continue;
			else {
				sb.append(ori.charAt(i));
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
