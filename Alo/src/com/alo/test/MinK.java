package com.alo.test;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ��Ŀ����
	�ҳ�n��������С��k��
	��������:
	ÿ��������������ո�ָ��n+1�����������һ������Ϊkֵ,n
	������100��
	�������:
	���n����������С��k�������������
	ʾ��1
	����
	
	3 9 6 8 -10 7 -11 19 30 12 23 5
	���
	
	-11 -10 3 6 7
 * @author Administrator
 *
 */
public class MinK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []str = sc.nextLine().split(" ");
		int k =Integer.parseInt(str[str.length-1]);
		int toInt[] = new int[str.length-1] ;
		for(int i=0;i<str.length-1;i++)  toInt[i]=Integer.parseInt(str[i]);
		Arrays.sort(toInt);
		int[] rs = Arrays.copyOfRange(toInt, 0, k);
		for(int i=0;i<k-1;i++) System.out.print(rs[i]+" ");
		System.out.print(rs[k-1]);
		sc.close();
	}
}
