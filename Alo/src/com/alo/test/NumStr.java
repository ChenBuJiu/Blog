package com.alo.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * ��Ŀ����
	����n�������������������ӳ�һ�ţ����һ�����Ķ�λ������
	��:n=3ʱ��3������13,312,343,���ɵ��������Ϊ34331213��
	��:n=4ʱ,4������7,13,4,246���ӳɵ��������Ϊ7424613��
	��������:
	�ж������������ÿ����������������У���һ��Ϊһ������N��N<=100�����ڶ��а���N����(ÿ����������1000���ո�ֿ�)��
	�������:
	ÿ���������һ����ʾ����������
	ʾ��1
	����
	
	2
	12 123
	4
	7 13 4 246
	���
	
	12312
7424613
 * @author Administrator
 *
 */
public class NumStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			String []str = sc.nextLine().split(" ");
			Arrays.sort(str,new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					String l = o1+o2;
					String r = o2+o1;
					return r.compareTo(l);
				}
				
			});
			StringBuffer sb = new StringBuffer();
			for(String s:str) {
				sb.append(s);
			}
			System.out.println(sb);
		}
		sc.close();
		
	}
}
