package com.alo.offer;
/**
 * ʱ�����ƣ�3�� �ռ����ƣ�32768K �ȶ�ָ����7180
����֪ʶ�㣺 �ݹ� ��̬�滮
 �㷨֪ʶ��Ƶ����
��Ŀ����
���������޵�Ӳ�ң���ֵΪ25�֡�10�֡�5�ֺ�1�֣����д�������n���м��ֱ�ʾ����
����һ��int n���뷵��n���м��ֱ�ʾ������֤nС�ڵ���100000��Ϊ�˷�ֹ������뽫��Mod 1000000007��
����������
6
���أ�2
 * @author Administrator
 *
 */
public class Coins {
	//һά
    public int countWays(int n) {
        // write code here
    	int []coins= {1,5,10,25};
    	int dp[]=new int[n+1];
    	Math.min(1, 2);
    	dp[0]=1;//ȡ0�ֵķ���Ϊһ�֣�����һ�����Ҷ���ȡ
    	for(int i=0;i<coins.length;i++)
    		for(int j=1;j<=n;j++) {
    			if(j>=coins[i]) {
    				dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
    			}
    		}
     return dp[n];   
    }
	//��ά
    public int countWays2(int n) {
        // write code here
    	int []coins= {1,5,10,25};
    	int dp[][]=new int[coins.length][n+1];
    	//ȡ0�ֵķ���Ϊһ�֣�����һ�����Ҷ���ȡ
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
