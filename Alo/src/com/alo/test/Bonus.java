package com.alo.test;
/**
 * 题目描述
小东所在公司要发年终奖，而小东恰好获得了最高福利，他要在公司年会上参与一个抽奖游戏，
游戏在一个6*6的棋盘上进行，上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，
他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，一路上的格子里的礼物小东都能拿到，
请设计一个算法使小东拿到价值最高的礼物。
给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角为[0,0],请返回能获得的最大价值，
保证每个礼物价值大于100小于1000
 * @author Administrator
 *
 */
public class Bonus {
    public int getMost(int[][] board) {
        // write code here
    	int [][]t  =new int[7][7];
/*    	for(int i=1;i<=6;i++) {
    		t[1][i]=board[0][i-1];
    		t[i][1]=board[i-1][0];
    	}*/
    	for(int i=1;i<=6;i++) {
    		for(int j=1;j<=6;j++) {
    			t[i][j]=Math.max(t[i-1][j],t[i][j-1])+board[i-1][j-1];
    		}
    	}
    	return t[6][6];
    }
}