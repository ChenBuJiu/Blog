package com.alo.test;

import java.util.Scanner;

/**
 * ����һ����n��������������A��һ������sum,��ѡ������A�в������ֺ�Ϊsum�ķ�������
	������ѡȡ������һ�����ֵ��±겻һ��,���Ǿ���Ϊ�ǲ�ͬ����ɷ�����
	��������:
	����Ϊ����:
	
	��һ��Ϊ����������n(1 �� n �� 1000)��sum(1 �� sum �� 1000)
	
	�ڶ���Ϊn��������A[i](32λ����)���Կո������
	�������:
	�������ķ�����
	ʾ��1
	����
	
	5 15
	5 5 10 2 3
	���
	
	4
 * @author Administrator
 *
 */
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum =sc.nextInt();
		int []a =new int[n+1];
		for(int i=1;i<=n;i++) a[i]=sc.nextInt();
		sc.close();
		long [][]dp=new long[n+1][sum+1];
		dp[0][0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				if(j>=a[i]) {
					 dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i]];//û�����i֮ǰ�������������i������֮��
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][sum]);
	}
}
