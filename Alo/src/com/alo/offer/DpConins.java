package com.alo.offer;

import java.util.Scanner;

/**
 * ��Ŀ����
���ǽ���1�֡�5�֡�10�֡�25�ֺ�50����5��Ӳ��֧��ĳһ�������Ľ�
������Ҫ֧��11��Ǯ����һ��1�ֺ�һ��10�֡�һ��1�ֺ�����5�֡�����1�ֺ�һ��5�֡�ʮһ��1����4�ַ�ʽ��
��дһ�����򣬼���һ�������Ľ���м���֧����ʽ��
ע���ٶ�֧��0Ԫ��1�ַ�ʽ��
��������:
��������������ݡ�

ÿ�����ݰ���һ��������n��1��n��10000��������Ҫ֧���Ľ�
�������:
��Ӧÿһ�����ݣ����һ������������ʾ�滻��ʽ��������
ʾ��1
����

11
26
���

4
13
 * @author Administrator
 *
 */
public class DpConins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(resolve(n));
		}
		sc.close();
	}

	private static int resolve(int n) {
		// TODO Auto-generated method stub
		int []a = new int[n+1];
		int [] coins ={1,5,10,25,50};
		a[0]=1;
		for(int i=0;i<coins.length;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=coins[i]) {
					a[j]=a[j]+a[j-coins[i]];
				}
			}
		}
		return a[n];
	}
}
