package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	�����������һ��Ӷ��־��ܵ��������������������Ҫ�����ڷ���ͽ���Ĺ��̣���ѧ�Ҹ���ʵ�����ݹ��ƣ�����ڷ�������У������� x �̶ȵ���ģ���ô�ڽ���Ĺ����оͻ���� x2 �̶ȵ���ģ�����ɴ�������ĳ����������;öȣ��������ͻᱬը׹�١���һ���;ö�Ϊ h �ķ������������ڷ��й����в�������ģ���ôΪ�˱�֤����԰�ȫ�ĵ���Ŀ�ĵأ�ֻ���������⣬���෢������п��Գ��ܶ��ٳ̶ȵ���ģ�
	��������:
	ÿ���������һ������������ÿ��������������һ��һ������ h ��1 <= h <= 10^18����
	�������:
	���һ��һ��������ʾ�����
	ʾ��1
	����
	
	10
	���

2
 * @author Administrator
 *
 */
public class Des {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long n = (long) Math.sqrt(h);
		if(n*(n+1)<=h) System.out.println(n);
		System.out.println(n-1);
		sc.close();
	}
}
