package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	��һ��X*Y������С��Ҫ�ڴ������ϴ����Ͻǵ����½ǣ�ֻ���߸����ֻ�����һ������ߡ������һ���㷨������С���ж������߷�����������������int x,int y���뷵��С�ŵ��߷���Ŀ��
	��������:
	�������һ�У����Ÿ���������������x��y��ȡֵ��Χ[1,10]��
	�������:
	�������һ�У�Ϊ�߷�����Ŀ��
	ʾ��1
	����
	
	3 2
	���
	
	10
 * @author Administrator
 *ע�� �ߵ��Ǹ�㣬����x,y�Ĺ�ģ��+1
 */
public class DpGrid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		int[][]t = new int[x+1][y+1];
		for(int i=0;i<=x;i++) t[i][0]=1;
		for(int i=0;i<=y;i++) t[0][i]=1;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				t[i][j]=t[i-1][j]+t[i][j-1];
			}
		}
		System.out.println(t[x][y]);
	}
}
