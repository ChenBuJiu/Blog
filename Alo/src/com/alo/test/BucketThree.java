package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
������һ�����飬��ֵΪ��1��10000���������������֡�����ĳ��żȻ������������������ж�ʧ��ĳ����Ԫ�أ�ͬʱ˳�򱻴��ң�������Ҫ�������ķ����ҳ���ʧ��������Ԫ�أ����ҽ�������Ԫ�ظ��ݴ�С��������ƴ��Ϊһ�������֣����������7�������� ������ʧ��Ԫ��Ϊ336��10��8435���õ���������Ϊ103368435�������ߵ�����Ϊ2��
��������:
��������Ϊһ�У�����9997�����֣��ո������
�������:
���Ϊһ�У�����һ�����֡�
ʾ��1
����

ͬ������������
���

2
 * @author Administrator
 *
 */
public class BucketThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a= new int[10000];
		for(int i=0;i<9997;i++) {
			int index =sc.nextInt();
			a[index-1]=index;
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<10000;i++) {
			if(a[i]==0) {
				sb.append(i);
			}
		}
		System.out.println(Long.parseLong(sb.toString())%7);
		sc.close();
	}
}
