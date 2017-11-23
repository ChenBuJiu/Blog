package com.alo.offer;
/**
 * 未优化的0-1背包算法
 * @author Administrator
 *
 */
public class Knapsack {
	public static void main(String[] args) {
		int []tag=new int[5];
		int [] w= {2,2,6,5,4};
		int []v= {6,3,5,4,6};
		System.out.println(new Knapsack().knapsack(tag.length, 10,w ,v, tag));
		for(int i=0;i<tag.length;i++) {
			 System.out.print(tag[i]+" ");
		}
	}
	/**
	 * 
	 * @param n 物品的数量
	 * @param W背包的容量
	 * @param w物品的重量
	 * @param v物品的价值
	 * @return
	 */
	public int knapsack(int n,int W,int []w,int[] v,int[]tag) {
		int [][]rs = new int[n+1][W+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=W;j++) {
				if(j<w[i-1]) {
					rs[i][j]=rs[i-1][j];
				}else {
					rs[i][j]=Math.max(rs[i-1][j],rs[i-1][j-w[i-1]]+v[i-1]);
				}
			}
		}
		int j=W;
		for(int i=n;i>0;i--) {
			if(rs[i][j]>rs[i-1][j]){
				tag[i-1]=1;
				j-=w[i-1];
			}else {
				tag[i-1]=0;
			}
		}
		for(int i=0;i<=n;i++) {
			for( j=0;j<=W;j++) {
				System.out.print(rs[i][j]+" ");
			}
			System.out.println();
		}
		return rs[n][W];
	}
}
