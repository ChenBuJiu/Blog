package com.alo.test;

import java.util.Scanner;

/**
 * 
	�����һ���㷨�ܹ�����������ַ����洢������������Ӳ������ԷǷ��������򷵻�error
	��������:
	����Ϊһ�У����������ַ������ַ����ĳ�����[1,100]��
	�������:
	���Ϊһ�С��Ϸ���������ӽ�����Ƿ�������error
	ʾ��1
	����
	
	123 123
	abd 123
	���
	
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
