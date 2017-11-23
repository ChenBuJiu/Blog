package com.alo.offer;
/**
 * 时间限制：3秒 空间限制：32768K 热度指数：7180
本题知识点： 递归 动态规划
 算法知识视频讲解
题目描述
有数量不限的硬币，币值为25分、10分、5分和1分，请编写代码计算n分有几种表示法。
给定一个int n，请返回n分有几种表示法。保证n小于等于100000，为了防止溢出，请将答案Mod 1000000007。
测试样例：
6
返回：2
 * @author Administrator
 *
 */
public class Coins {
	//一维
    public int countWays(int n) {
        // write code here
    	int []coins= {1,5,10,25};
    	int dp[]=new int[n+1];
    	Math.min(1, 2);
    	dp[0]=1;//取0分的方法为一种，就是一个银币都不取
    	for(int i=0;i<coins.length;i++)
    		for(int j=1;j<=n;j++) {
    			if(j>=coins[i]) {
    				dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
    			}
    		}
     return dp[n];   
    }
	//二维
    public int countWays2(int n) {
        // write code here
    	int []coins= {1,5,10,25};
    	int dp[][]=new int[coins.length][n+1];
    	//取0分的方法为一种，就是一个银币都不取
    	for(int i=0;i<=n;i++)
    		dp[0][i]=1;
    	for(int i=0;i<coins.length;i++)
    		for(int j=1;j<=n;j++) {
    			int t =j-coins[i];
    			if(t>=0) {
    				dp[i][j]=(dp[i][j]+dp[i][j-coins[i]])%1000000007;
    			}else {
    				dp[i][j]=dp[i-1][j];
    			}
    		}
     return dp[coins.length][n];   
    }
    
}
