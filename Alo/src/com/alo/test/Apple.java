package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
С��ȥ�������̵���ƻ������թ���̷�ʹ���������ף�ֻ�ṩ6��ÿ����8��ÿ���İ�װ(��װ���ɲ��)�� ����С������ֻ�빺��ǡ��n��ƻ����С���빺�����ٵĴ�������Я����������ܹ���ǡ��n��ƻ����С�׽����Ṻ��
��������:
����һ������n����ʾС���빺��n(1 �� n �� 100)��ƻ��
�������:
���һ��������ʾ������Ҫ����Ĵ��������������ǡ��n��ƻ�������-1
ʾ��1
����

20
���

3
 * @author Administrator
 *
 */
public class Apple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		for(i=0;i<=n/6;i++) {
			if((n-6*i)%8==0) {
				System.out.println(i+(n-6*i)/8);
				break;
			}
		}
		if(i==n/6+1)System.out.println(-1);
		sc.close();
	}
}
