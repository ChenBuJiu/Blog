package com.alo.test;

import java.util.Scanner;

/**
 * һ������������n����ÿ�������涼��һ������(ӵ����ͬ����������������)�����һ�����������˵ĵ��ҽ���������ĺ���ĺʹ���������ĺ���Ļ���
	���磺��������������ĺ�����{1, 1, 2, 3}��������Ӿ������˵ģ���Ϊ1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
	������ʵ��Ӵ������Ƴ�һЩ��(�����Ƴ�0��,���Ǳ��Ƴ���)��Ҫʹ�Ƴ���Ĵ��������˵ġ����������̼���һ������Ի�õĶ����ֲ�ͬ�����˵Ĵ��ӡ�
	��������:
	��һ������һ��������n(n �� 1000)
	�ڶ���Ϊn����������xi(xi �� 1000)
	�������:
	������Բ��������˵Ĵ�����
	ʾ��1
	����
	
	3
	1 1 1
	���
	
	2
 * @author Administrator
 *
 */
public class LuckyBag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++) a[i] =sc.nextInt();
		sc.close();
		
	}
}