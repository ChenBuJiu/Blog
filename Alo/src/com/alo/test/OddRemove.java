package com.alo.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ��Ŀ����
����һ����0..n����������������ɵ����У�����Ҫ����һЩɸѡ��ÿ������ȡ��ǰ���������д�С����ĵ�����λ�������������䶪�����ظ���һ����ֱ�����ʣ��һ��������������ʣ�µ����֡�
��������:
ÿ������һ��һ�����֣�Ϊ��Ŀ�е�n(nС�ڵ���1000)��
�������:
һ��������ʣ�µ����֡�
ʾ��1
����

500
���

255
 * @author Administrator
 *
 */
public class OddRemove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(rec(n));
		sc.close();
	}

	private static int rec(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<=n;i++) list.add(i);
		while(list.size()>1) {
			int i=1;
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			while(i<=list.size()-1) {
				temp.add(list.get(i));
				i=i+2;
			}
			list.clear();
			list.addAll(temp);
			
		}
		return list.get(0);
	}
}
