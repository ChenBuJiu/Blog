package com.alo.offer;
/**
 * 快排
 * @author Administrator
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int []a ={564,378,954,1255,684,57,15,389,687,687,45,98,15,125,348};
		//int []a ={6,6,6,6,6,6,6,6,6,6};
		new QuickSort().QuickSort(a, 0, a.length-1);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public void QuickSort(int []a,int low,int high) {
		int pivotpos=0;
		if(low<high) {
			pivotpos=partition(a,low,high);
			QuickSort(a,low,pivotpos-1);
			QuickSort(a,pivotpos+1,high);
		}
	}
	private int partition(int []a,int low,int high) {
		int i=low,j=high,pivot=a[low];//选取第一个作为基准元素
		while(i<j) {
			while(i<j&&pivot<=a[j]) j--; 
			if(i<j) swap(a,j,i++);
			while(i<j&&pivot>=a[i]) i++;
			if(i<j) swap(a,i,j--);
		}
		return i;
	}
	private void swap(int []a ,int i,int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
