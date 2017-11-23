package com.alo.test;

import java.util.Scanner;

/**
 * 
	请设计一个算法能够完成两个用字符串存储的整数进行相加操作，对非法的输入则返回error
	输入描述:
	输入为一行，包含两个字符串，字符串的长度在[1,100]。
	输出描述:
	输出为一行。合法情况输出相加结果，非法情况输出error
	示例1
	输入
	
	123 123
	abd 123
	输出
	
	246
	Error
 * @author Administrator
 *
 */
public class Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []str = sc.nextLine().split(" ");
		for(String s:str) {
			for(int i=0;i<s.length();i++) {
				if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')) {
					System.out.println("Error");
					return;
				}
			}
		}
		if(str[0].length()<str[1].length()) {
			String temp=str[0];
			str[0]=str[1];
			str[1]=temp;
		}
		int []rs = new int[str[0].length()+1];
		int r =str[0].length()-1;
		int l=str[1].length()-1;
		int i=0;
		while(l>=i) {
			rs[r-i]=str[0].charAt(r-i)+str[1].charAt(l-i)-96;
			i++;
		}
		while(r>=i) {
			rs[r-i]=str[0].charAt(r-i)-48;
			i++;
		}
		for(int k=r;k>=1;k--) {
			int a =rs[k]%10;
			int b =rs[k]/10;
			rs[k]=a;
			rs[k-1]+=b;
		}
		for(int k=0;k<=r;k++) {
			System.out.print(rs[k]);
		}

		sc.close();
	}
}
