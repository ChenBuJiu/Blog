package com.alo.test;

import java.util.Scanner;

/**
 * �����������1��5��10��20��50��100Ԫ��ֽ�ң�����ÿ�ֱ�ֵ���������㹻�࣬��д���������NԱ��NΪ0-10000�ķǸ��������Ĳ�ͬ��ϵĸ�����
��������:
����Ϊһ������N������Ҫƴ�յ����
�������:
���Ҳ��һ�����֣�Ϊ���N����ϸ�����
ʾ��1
����

5
���

2
 * @author Administrator
 *
 */
public class ComboMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] a = {1,5,10,20,50,100};
		long []dp = new long[n+1];
		dp[0]=1;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=a[i]) {
					dp[j]+=dp[j-a[i]];
				}
			}
		}
		System.out.println(dp[n]);
		sc.close();
	}


}
