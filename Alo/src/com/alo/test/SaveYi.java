package com.alo.test;

import java.util.Scanner;

/**
 * ʱ�����ƣ�1�� �ռ����ƣ�32768K �ȶ�ָ����6311
	 �㷨֪ʶ��Ƶ����
	��Ŀ����
	��һƬ1000*1000�Ĳݵأ�С�׳�ʼվ��(1,1)(�����Ͻǵ�λ��)��С����ÿһ��������������ƶ������ڵĲݵ��ϳԲ�(С�ײ����߳��߽�)�����ɳ�����ȥ��׽�ɰ���С�ף���������n�����塣��i�����屻�����ں�����Ϊxi ��������Ϊyi ��λ���ϣ�С��һ������һ�����壬���ᱻ������׽����Ϊ��ȥ���С�ף���Ҫ֪��С�����ٶ�������ܻ�����һ�����壬�Ӷ���ǰ���С�ס�
	��������:
	��һ��Ϊһ������n(n �� 1000)����ʾ����һ��ӵ��n�����塣
	�ڶ�����n������xi����ʾ��i������ĺ�����
	��������n������yi����ʾ��i�������������
	��֤���궼�ڲݵط�Χ�ڡ�
	�������:
	���һ������,��ʾС�����ٿ��ܶ���������볬��������
	ʾ��1
	����
	
	3
	4 6 8
	1 2 1
	���
	
	3
 * @author Administrator
 *
 */
public class SaveYi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		for(int i=0;i<n;i++) b[i]=sc.nextInt();
		int min =Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]-1+b[i]-1<min) min=a[i]-1+b[i]-1;
		}
		System.out.println(min);
		sc.close();
	}
}
