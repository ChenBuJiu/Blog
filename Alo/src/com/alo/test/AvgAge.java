package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	��֪ĳ��˾������ΪW��ƽ������ΪY��(ÿ��3��ĩ���㣬ͬʱÿ��3�³���ְ����)������ÿ����ְ��Ϊx��x>0&&x<1,ÿ�걣������Ա���������������Ƹ����Ա��ƽ������21�ꡣ 
	�ӽ���3��ĩ��ʼ����ʵ��һ���㷨�����Լ������N���˾Ա����ƽ�����䡣(���������ȡ��)��
	��������:
	����W Y x N
	�������:
	�����N����ƽ������
	ʾ��1
	����
	
	5 5 0.2 3
	���
	
	15

 *
 */
public class AvgAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int w = sc.nextInt();
			double y = sc.nextDouble();
			double x = sc.nextDouble();
			int n = sc.nextInt();
			System.out.println((int)Math.ceil(sol(w,y,x,n)));
		}
		sc.close();
	}
	public static double sol(int w,double y,double x,int n) {
		y=((w-w*x)*(y+1)+w*x*21)/w;
		if(n==1) return y;
		else {
			return sol(w,y,x,n-1);
		}
	}
}
