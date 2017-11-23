package com.alo.offer;

import java.util.Scanner;

/**
 * n个数中找到最小的m个数 使用大顶堆
 * n个书中找到最大的m个数 使用小顶堆
 * @author Administrator
 *
 */
//输入实例：
public class MaxHeap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		MaxHeap mh = new MaxHeap(k);
		for(int i=0;i<n;i++) {
			mh.add(sc.nextInt());;
		}
		int []rs = mh.getData();
		for(int i:rs) System.out.print(i+" ");
		sc.close();
	}
	private int [] a ;
	public MaxHeap(int k){
		this.a = new int[k+1]; //下标从1开始
		for(int i=1;i<=k;i++) {
			this.a[i]= Integer.MAX_VALUE;
		}
		
	}
	public int getLength() {
		return a.length;
	}
	public int left(int i) {
		return i<<1;
	}
	public int right(int i) {
		return (i<<1)+1;
	}
	public void add(int e) {
		if(e<a[1]) { //如果比大顶堆的最大数小的话，将其添加到堆中
			a[1]=e;
			adjustHeap(1);
		}
	}
	private void adjustHeap(int root) {
		// TODO Auto-generated method stub
		int l=this.left(root); 
		int r =this.right(root);
		int max =root;
		if(l<this.getLength()&&a[l]>a[max])max=l;
		if(r<this.getLength()&&a[r]>a[max])max=r;//root的左右孩子和自己比较，找到当中值最大的下标，如果就是root的话，那么不用进行调整，否则，root和最大的值交换；
		if(max==root) {							//然后递归判定交换后的下标作为根节点，是否符合root最大的条件
			return;
		}
		swap(root,max);
		this.adjustHeap(max);
	}
	private void swap(int root, int max) {
		// TODO Auto-generated method stub
		int temp =a[root];
		a[root]=a[max];
		a[max]=temp;
	}
	public int [] getData() {
		return this.a;
	}
}
