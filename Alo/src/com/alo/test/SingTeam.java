package com.alo.test;

import java.util.Scanner;

/**
 * 题目描述
	有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
	输入描述:
	每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
	输出描述:
	输出一行表示最大的乘积。
	示例1
	输入
	
	3
	7 4 7
	2 50
	输出
	
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
		long[][][]t= new long[50][10][2];//已。。结尾，选取的个数，最大值最小值
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
