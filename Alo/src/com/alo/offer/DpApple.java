package com.alo.offer;

import java.util.Scanner;

/**
 * ��Ŀ����
�� M ��ͬ����ƻ������ N ��ͬ��������������е����ӿ��Ų��ţ��ʹ��ж����ֲ�ͬ�ķַ���
ע�⣺5��1��1 �� 1��5��1 ��ͬһ�ַַ�����˳���޹ء�
��������:
��������������ݡ�

ÿ�����ݰ������������� m��n��1��m, n��20����
�������:
��Ӧÿ�����ݣ����һ������k����ʾ��k�ֲ�ͬ�ķַ���
ʾ��1
����

7 3
���

8
 * @author Administrator
 *
 */
public class DpApple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(solve(m,n));
		sc.close();
	}
/**
 * 
 * @param m ƻ����
 * @param n ������
 * @return
 */
	private static int solve(int m, int n) {
		// TODO Auto-generated method stub
		if(n==1||m==0) {
			return 1;
		}else if(m<n){
			return solve(m,m);
		}else {
			return solve(m-n,n)+solve(m,n-1);
		}
	}
}
