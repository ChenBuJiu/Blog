package com.alo.test;

import java.util.Scanner;

/**
 * Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
输入描述:
输入数据为一个文件路径
输出描述:
对于每个测试实例，要求输出对应的filename extension
示例1
输入

Abc/file.txt
输出

txt
 * @author Administrator
 *
 */
public class Suf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s[]=sc.nextLine().split("\\.");
			if(s.length==1) System.out.println("null");
			else System.out.println(s[s.length-1]);
		}
		sc.close();
	}
}
