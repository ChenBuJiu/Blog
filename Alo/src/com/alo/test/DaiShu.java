package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
һֻ����Ҫ�Ӻ���������Ӷ԰����Ӻܿ����Ǻ��м���˺ܶ�׮�ӣ�ÿ��һ�׾���һ����ÿ��׮���϶���һ�����ɣ��������������ϾͿ������ĸ�Զ��
ÿ������������ͬ����һ�����ִ������������������������Ϊ5���ʹ��������һ������ܹ���5�ף�
���Ϊ0���ͻ��ݽ�ȥ�޷�������Ծ������һ��N�׿������ʼλ�þ��ڵ�һ���������棬
Ҫ�������һ������֮���������ˣ�����ÿ�����ɵ������������������Ҫ�������ܹ�����԰���
����޷��������-1
��������:
��������У���һ�������鳤��N (1 �� N �� 10000)���ڶ�����ÿһ���ֵ���ÿո�ָ���
�������:
������ٵ��������޷��������-1
ʾ��1
����

5
2 0 1 1 1
���

4
 * @author Administrator
 *
 */
public class DaiShu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		int []dp = new int[n];
		int []flag = new int[n];
		boolean tag= false;
		for(int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++ ) {
			if(a[i]>0)
			for(int j=1;j<=a[i];j++) {
				if(i+j<n) {
				if(a[i+j]>0&&flag[i+j]==0) {
					dp[i+j]=dp[i]+1 ;
					flag[i+j]=1;
				}}
				else {
					tag=true;
				}
			}
		}
		if(dp[n-1]==0) {
			System.out.println(-1);
		}else {
			if(tag) {
				System.out.println(dp[n-1]);
			}else {
				System.out.println(dp[n-1]+1);
			}
		}
		sc.close();
	}
}

