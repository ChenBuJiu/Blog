package com.alo.test;

import java.util.Scanner;

/**
 * С����һ�����۰����ߣ����Ҷ���һ����������Լ��ʮ�ָ���Ȥ��һ��С����������һ�����⣺ ���庯��f(x)Ϊx��������Լ����xΪ�������� ����:f(44) = 11.
	���ڸ���һ��N����Ҫ��� f(1) + f(2) + f(3).......f(N)
	���磺 N = 7 
	f(1) + f(2) + f(3) + f(4) + f(5) + f(6) + f(7) = 1 + 1 + 3 + 1 + 5 + 3 + 7 = 21
	С�׼�������������������ѣ���Ҫ�������һ���㷨��������
	��������:
	����һ������N (1 �� N �� 1000000000)
	�������:
	���һ����������Ϊf(1) + f(2) + f(3).......f(N)
	ʾ��1
	����
	
	7
	���
	
	21
 * @author Administrator
 *
 */
public class Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long rs=0;
		rs = rec(n);
		System.out.println(rs);
		sc.close();
	}
	public static long rec(long n) {
		long rs =0;
		if(n==1) {
			rs++;
		}
		else if(n%2==1){
			rs = (1+n)*(1+n)/4+rec((n-1)/2);
		}else {
			rs=(1+n-1)*(1+n-1)/4+rec(n/2);
		}
		 return rs;
	}
}
