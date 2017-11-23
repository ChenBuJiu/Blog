package com.alo.offer;

import java.util.Scanner;

/**
 * n�������ҵ���С��m���� ʹ�ô󶥶�
 * n�������ҵ�����m���� ʹ��С����
 * @author Administrator
 *
 */
//����ʵ����
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
		this.a = new int[k+1]; //�±��1��ʼ
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
		if(e<a[1]) { //����ȴ󶥶ѵ������С�Ļ���������ӵ�����
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
		if(r<this.getLength()&&a[r]>a[max])max=r;//root�����Һ��Ӻ��Լ��Ƚϣ��ҵ�����ֵ�����±꣬�������root�Ļ�����ô���ý��е���������root������ֵ������
		if(max==root) {							//Ȼ��ݹ��ж���������±���Ϊ���ڵ㣬�Ƿ����root��������
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
