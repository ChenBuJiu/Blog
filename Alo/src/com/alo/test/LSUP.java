package com.alo.test;

import java.util.Arrays;

/**
 * 对于一个数字序列，请设计一个复杂度为O(nlogn)的算法，返回该序列的最长上升子序列的长度，这里的子序列定义为这样一个序列U1，U2...，其中Ui < Ui+1，且A[Ui] < A[Ui+1]。
给定一个数字序列A及序列的长度n，请返回最长上升子序列的长度。
测试样例：
[2,1,4,3,1,5,6],7
返回：4
 * @author Administrator
 *
 */
public class LSUP {
	 public int findLongest(int[] A, int n) {
	        // write code here
		 int []t= new int[n];
		 t[0]=1;
		 for(int i=1;i<n;i++) {
			 t[i]=1;
			 for(int j=0;j<i;j++) {
				if(A[i]>A[j]&&t[i]-1<t[j]) {//t[i]<t[j]+1 在没有添加第i个数字时，它之前的已j结尾的递增序列的最长长度，添加的时机：j结尾的序列+长度1相对于之前j结尾的序列更长，才添加
					t[i]=t[j]+1;			// 2 1 4  （1） （1，1） （1，1） （1，1，1）（1，1，2） （1，1，2）
				}							//2，4已经产生一个长度为2的递增序列 2，1，4长度为3但不是递增序列，1，4长度为2 也没有必要更新
				
			 }
		 }
		 Arrays.sort(t);
		 return t[n-1];
	    }
}
