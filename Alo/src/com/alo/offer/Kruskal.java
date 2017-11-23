package com.alo.offer;

import java.util.Scanner;
public class Kruskal {
	static final int MAX=Integer.MAX_VALUE;//表示连点之间 不存在连接,连接矩阵中自己到自己的距离为0
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]adjacency = new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				adjacency[i][j]=sc.nextInt();
			}
		}
		int sum = Kruskal(adjacency,n);
		System.out.println("最小sum = "+sum);
		sc.close();
	}
	
	public static int Kruskal(int [][]adjacency,int n) {
		boolean flag =false;
		int sum=0,from=0,to=0;
		int []join = new int[n];//标识数组
		int joinNum=1;
		while(!flag) {
			int min = MAX;
			for(int i=0;i<n;i++) { //由于没有对边权值进行排序，速度会较慢
				for(int j=0;j<n;j++){
					if(adjacency[i][j]>0&&min>adjacency[i][j]) {
						if(join[i]!=join[j]||join[i]==0&&join[j]==0) {
							min=adjacency[i][j];
							from=i;
							to=j;
						}
					}
				}
			}
			if(min==MAX) {
				continue;
			}
			System.out.println(from+"到"+to+"距离为:"+min);
			sum+=min;
			if(join[from]==0&&join[to]==0) { //这两点都没有加入，将其标记为同一颗树
				join[from]=join[to]=++joinNum;
			}else if(join[from]>0&&join[to]>0) {//两个子树的合并，选择两棵子树种的一个它的标识作为合并后的子树的标识
				int temp=join[from];
				for(int k=0;k<n;k++) {
					if(join[k]==temp) {
						join[k]=join[to];
					}
				}
			}else {//次情况是将一哥点加入到一颗子树当中去，标识为这课子树的标识
				if(join[from]==0) { 
					join[from]=join[to];
				}else {
					join[to]=join[from];
				}
			}
			for(int k=1;k<n;k++) {
				if(join[0]!=join[k]) {//给定的条件一定要能将所有点包括构成最小生成树，否则，此处如果没有点和0连通，将会导致无限循环。
					flag=false;
					break;
				}else {
					flag=true;
				}
			}
			if(flag) {
				break;
			}
			
		}
		return sum;
	}
}