package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	�� n ��ѧ��վ��һ�ţ�ÿ��ѧ����һ������ֵ��ţţ����� n ��ѧ���а���˳��ѡȡ k ��ѧ����Ҫ����������ѧ����λ�ñ�ŵĲ���� d��ʹ���� k ��ѧ��������ֵ�ĳ˻�������ܷ������ĳ˻���
	��������:
	ÿ��������� 1 ������������ÿ���������ݵĵ�һ�а���һ������ n (1 <= n <= 50)����ʾѧ���ĸ�������������һ�У����� n ����������˳���ʾÿ��ѧ��������ֵ ai��-50 <= ai <= 50������������һ�а�������������k �� d (1 <= k <= 10, 1 <= d <= 50)��
	�������:
	���һ�б�ʾ���ĳ˻���
	ʾ��1
	����
	
	3
	7 4 7
	2 50
	���
	
	49
 * @author Administrator
 *
 */
public class SingTeam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int m =sc.nextInt();
		int d =sc.nextInt();
		long ans=0;
		long[][][]t= new long[50][10][2];//�ѡ�����β��ѡȡ�ĸ��������ֵ��Сֵ
		for(int i=0;i<n;i++) {
			t[i][0][0]=t[i][0][1]=a[i];
			for(int j=1;j<m;j++) {
				 for(int k=i-1;k>=Math.max(i-d,0);--k){  
		                t[i][j][0]=Math.max(t[i][j][0],Math.max(t[k][j-1][0]*a[i],t[k][j-1][1]*a[i]));  
		                t[i][j][1]=Math.min(t[i][j][1],Math.min(t[k][j-1][0]*a[i],t[k][j-1][1]*a[i]));  
		            } 
			}
			ans =Math.max(ans, Math.max(t[i][m-1][0], t[i][m-1][1]));
		}
		System.out.println(ans);
		sc.close();
	}
}
