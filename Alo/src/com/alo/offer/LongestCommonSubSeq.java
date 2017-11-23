package com.alo.offer;
/**
 * 最长公共子序列
 * @author Administrator
 *
 */
public class LongestCommonSubSeq {
	public static void main(String[] args) {
		System.out.println(new LongestCommonSubSeq().LCS1("bahegaej".toCharArray(), "aedbdfafehefejgajkeej".toCharArray()));
		System.out.println(new LongestCommonSubSeq().LCS2("bahegaej".toCharArray(), "aedbdfahefejgajkeej".toCharArray()));
	}
	/**
	 * 不需要连续
	 * @param a
	 * @param b
	 * @return
	 */
	public int  LCS1(char []a,char[]b){
		int n=a.length,m=b.length;
		int [][] rs = new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(a[i-1]==b[j-1]) {
					rs[i][j]=rs[i-1][j-1]+1;
				}else if(rs[i][j-1]>=rs[i-1][j]) {
					rs[i][j]=rs[i][j-1];
				}else {
					rs[i][j]=rs[i-1][j];
				}
			}
		}
		
		return rs[n][m];
	}
	/**
	 * 要求连续
	 * @param a
	 * @param b
	 * @return
	 */
	public int  LCS2(char []a,char[]b){
		int n=a.length,m=b.length;
		int [][] rs = new int[n+1][m+1];
		int max=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(a[i-1]==b[j-1]) {
					rs[i][j]=rs[i-1][j-1]+1;
					if(rs[i][j]>max) max=rs[i][j];
				}else {
					rs[i][j]=0;
				}
			}
		}
		
		return max;
	}
}
