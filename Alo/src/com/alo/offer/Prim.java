package com.alo.offer;

import java.util.Scanner;

/**
 * prim,最小生成树算法，适用于点少边多的情况
 * 最小生成树：能够连通所有点的边权值的最小和
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
		System.out.println("最小权值为:"+sum);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
	/**
	 * 
	 * @param adjacency
	 * @param n
	 * @param start 第一个加入树的点
	 * @return
	 */
	public static int prim(int [][]adjacency,int n,int start) {
		int sum=0;
		int [][]mins = new int[n][2];
		for(int i=0;i<n;i++) {//初始化
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
		for(int i=0;i<n-1;i++) {//找到n-1条边
			int minV=-1,minW=MAX;
			for(int j=0;j<n;j++) {
				if(mins[j][1]!=0&&minW>mins[j][1]) {
					minV=j;
					minW=mins[j][1];
				}
			}
			sum+=minW;
			System.out.println("最小生成树的第"+(i+1)+"条最小边=<"+(mins[minV][0]+1)+","+(minV+1)+">，权重="+minW);
			mins[minV][1]=0; //已经加入到最小生成树中,距离start的距离便为0
			for(int j=0;j<n;j++){ //在加入一个节点后更新最小生成树到还未加入到最小生成树中的节点的最小距离
				if(mins[j][1]!=0) {//只对未加入到最小生成树中的节点进行更新
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
