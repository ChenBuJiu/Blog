package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	�������ʻ��ļ��ڣ�ˮ�ɻ��������������˵Ĵ�����ѧ���и�ˮ�ɻ�����������������ģ� ��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3�� ����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
	��������:
	���������ж��飬ÿ��ռһ�У�������������m��n��100 �� m �� n �� 999����
	�������:
	����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵�������ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
	��������ķ�Χ�ڲ�����ˮ�ɻ����������no;
	ÿ������ʵ�������ռһ�С�
	ʾ��1
	����
	
	100 120
	300 380
	���
	
	no
370 371
 * @author Administrator
 *
 */
public class ShuiXian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			boolean flag=false;
			StringBuffer sb = new StringBuffer();
			for(int i=n;i<=m;i++) {
				int r=i%10;
				int l=i/100;
				int mid=(i-l*100)/10;
				if(i==r*r*r+l*l*l+mid*mid*mid) {
					flag=true;
					sb.append(i+" ");
				}
				
			}if(flag) System.out.println(sb.substring(0, sb.length()-1));
			else System.out.println("no");
		}
		sc.close();
	}
}
