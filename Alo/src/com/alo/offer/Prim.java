package com.alo.offer;

import java.util.Scanner;

/**
 * prim,��С�������㷨�������ڵ��ٱ߶�����
 * ��С���������ܹ���ͨ���е�ı�Ȩֵ����С��
 * @author Administrator
 *
 */
/**
 * 
 * @author Administrator
 *
 */
public class Prim {
	static final int MAX=Integer.MAX_VALUE;
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]adjacency = new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				adjacency[i][j]=sc.nextInt();
			}
		}
		int sum= prime(adjacency,n,0);
		System.out.println("sum = "+sum);
		sc.close();
	}*/
	public static void main(String [] args){
		int [][] tree={
				{0,7,-1,12,-1,9},{7,0,2,-1,-1,1},{-1,2,0,-1,-1,1},{12,-1,-1,0,5,-1},{-1,-1,-1,5,0,5},{9,1,1,-1,5,0}			
		};
		int sum =prim(tree,6, 0);
		System.out.println("��СȨֵΪ:"+sum);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
	/**
	 * 
	 * @param adjacency
	 * @param n
	 * @param start ��һ���������ĵ�
	 * @return
	 */
	public static int prim(int [][]adjacency,int n,int start) {
		int sum=0;
		int [][]mins = new int[n][2];
		for(int i=0;i<n;i++) {//��ʼ��
			if(i==start) {
				mins[i][0]=-1;
				mins[i][1]=0;
			}else if(adjacency[0][i]!=-1) {
				mins[i][0]=0;
				mins[i][1]=adjacency[0][i];
			}else {
				mins[i][0]=-1;
				mins[i][1]=MAX;
			}
		}
		for(int i=0;i<n-1;i++) {//�ҵ�n-1����
			int minV=-1,minW=MAX;
			for(int j=0;j<n;j++) {
				if(mins[j][1]!=0&&minW>mins[j][1]) {
					minV=j;
					minW=mins[j][1];
				}
			}
			sum+=minW;
			System.out.println("��С�������ĵ�"+(i+1)+"����С��=<"+(mins[minV][0]+1)+","+(minV+1)+">��Ȩ��="+minW);
			mins[minV][1]=0; //�Ѿ����뵽��С��������,����start�ľ����Ϊ0
			for(int j=0;j<n;j++){ //�ڼ���һ���ڵ�������С����������δ���뵽��С�������еĽڵ����С����
				if(mins[j][1]!=0) {//ֻ��δ���뵽��С�������еĽڵ���и���
					if(adjacency[minV][j]!=-1&&adjacency[minV][j]<mins[j][1]) {
						mins[j][1]=adjacency[minV][j];
						mins[j][0]=minV;
					}
				}
			}
		}
		return sum;
	}
	
}
