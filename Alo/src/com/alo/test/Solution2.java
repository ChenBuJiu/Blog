package com.alo.test;
/*
 * [0,5,12,14,17,18,18],[1,27,34,34,45,46,48]
 */
public class Solution2 {
	public static void main(String[] args) {
		int []arr1= {0,5,12,14,17,18,18};
		int []arr2= {1,27,34,34,45,46,48};
		new Solution2().getUpMedian(arr1, arr2);
	}
	public int getUpMedian(int[] arr1, int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int i=0,j=0,index=0;
		int []a =new int[n+m];
		while(i<n&&j<m) {
			if(arr1[i]<arr2[j]) {
				a[index++]=arr1[i++];
			}else {
				a[index++]=arr2[j++];
			}
		}
		while(i<n) a[index++]=arr1[i++];
		while(j<m) a[index++]=arr2[j++];
		return a[(n+m)/2];
    }
}
