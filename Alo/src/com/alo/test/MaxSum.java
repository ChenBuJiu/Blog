package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	һ�������� N ��Ԫ�أ�����������������͡� ���磺[-1,2,1]������������������Ϊ[2,1]�����Ϊ 3
	��������:
	����Ϊ���С�
	��һ��һ������n(1 <= n <= 100000)����ʾһ����n��Ԫ��
	�ڶ���Ϊn��������ÿ��Ԫ��,ÿ����������32λint��Χ�ڡ��Կո�ָ���
	�������:
	���������������к�����ֵ��
	ʾ��1
	����
	
	3
	-1 2 1
	���
	
	3
 * @author Administrator
 *
 */
public class MaxSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int sum = a[0];
			for (int i = 1; i < n; i++) {
				if (a[i - 1] >= 0)
					a[i] = a[i - 1] + a[i];
				else {
					continue;
				}
				if (sum < a[i])
					sum = a[i];
			}
			System.out.println();
		}
		sc.close();

	}
}
