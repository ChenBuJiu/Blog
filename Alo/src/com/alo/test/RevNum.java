package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	����һ������X���������rev(X)Ϊ��X����λ��ת����������ȥ����ǰ��0������:
	��� X = 123����rev(X) = 321;
	��� X = 100����rev(X) = 1.
	���ڸ�������x��y,Ҫ��rev(rev(x) + rev(y))Ϊ���٣�
	��������:
	����Ϊһ�У�x��y(1 �� x��y �� 1000)���Կո������
	�������:
	���rev(rev(x) + rev(y))��ֵ
	ʾ��1
	����
	
	123 100
	���
	
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
