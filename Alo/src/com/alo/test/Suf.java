package com.alo.test;

import java.util.Scanner;

/**
 * Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
��������:
��������Ϊһ���ļ�·��
�������:
����ÿ������ʵ����Ҫ�������Ӧ��filename extension
ʾ��1
����

Abc/file.txt
���

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
