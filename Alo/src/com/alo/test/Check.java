package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	��Ϸ�����кܶ��ʽ����������������һ���������ֻ����һ�Σ���������һ����1024��������ID��Χ[1,1024]��
	����32��unsigned int��������¼��1024�������Ƿ��Ѿ���ɡ���ʼ״̬����δ��ɡ� 
	����������������������ID����Ҫ���õ�һ��ID������Ϊ�Ѿ���ɣ������ڶ���ID�������Ƿ��Ѿ���ɡ�
	 ���һ������������ڶ���ID�������Ѿ�������1�����δ������0�������һ��ڶ���ID����[1,1024]��Χ�������-1��
	��������:
	�������һ��,����������ʾ����ID.
	�������:
	����Ƿ����
	ʾ��1
	����
	
	1024 1024
	���
	
	1
 * @author Administrator
 *
 */
public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		sc.close();
		int []t = new int[1024];
		if(a<1||a>1024||b<1||b>1024) {
			System.out.println(-1);
		}else {
			if(t[b-1]==1) {System.out.println(1);}
			else if(a==b) {System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}

