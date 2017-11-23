package com.alo.offer;

import java.util.Scanner;

/**满m叉树
 * 着色问题
 * @author Administrator
 *n个顶点的无向连通图,下标从1开始，数字连续
 */
public class Color {
	int sum=0; //方案数
	String []colors= {"红","橙","黄"};//,"绿","蓝","靛","紫"
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String rs[]=new String[n];
		int adjacency[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				adjacency[i][j]=sc.nextInt();
			}
		}
		new Color().backtrace(0, rs, adjacency);
		sc.close();
	}
	/**
	 * 5
0 1 1 -1 -1
1 0 1 1 0
1 1 0 1 0
-1 1 1 0 1
-1 1 -1 1 0
	 * @param t
	 * @param rs
	 * @param adjacency
	 */
	public void backtrace(int t,String []rs,int[][] adjacency) {
		int n=adjacency.length;
		if(t>n-1) {
			sum++;
			System.out.print("这是第"+sum+"种方案:");
			for(int i=0;i<n;i++) {
				System.out.print(rs[i]+" ");
			}
			System.out.println();
		}else {
			for(int i=0;i<colors.length;i++) {
				rs[t]=colors[i];
				if(check(t,adjacency,rs)) {
					backtrace(t+1,rs,adjacency);
				}
				rs[t]=null;
			}
		}
	}
	private boolean check(int t,int [][]adjacency,String []rs) {
		// TODO Auto-generated method stub
		int n=adjacency.length;
		for(int i=0;i<n;i++) {
			if(adjacency[t][i]==1) {
				if(rs[t].equals(rs[i])) {
					return false;
				}
			}
		}
		return true;
	}
}	
