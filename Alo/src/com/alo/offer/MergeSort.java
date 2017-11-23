package com.alo.offer;
/**
 * ∫œ≤¢≈≈–Ú
 * @author Administrator
 *
 */
public class MergeSort {
	public static void main(String[] args) {
		int []a ={564,378,954,1255,684,57,15,389,687,45,98,125,348};
		new MergeSort().MergeSort(a,0,a.length-1);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public void MergeSort(int []a,int low,int high) {
		int mid=0;
		while(low<high) {
			mid=low+(high-low)/2;
			MergeSort(a,low,mid);
			MergeSort(a,mid+1,high);
			Merge(a,low,mid,high);
			return;
		}
	}

	private void Merge(int[] a, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int i=low,j=mid+1,k=0;
		int []b = new int[high-low+1];
		while(i<=mid&&j<=high) {
			if(a[i]<=a[j]) {
				b[k++]=a[i++];
			}else {
				b[k++]=a[j++];
			}
		}
		while(i<=mid) {
			b[k++]=a[i++];
		}
		while(j<=high) {
			b[k++]=a[j++];
		}
		for(int x=0,m=low;m<=high;m++) {
			a[m]=b[x++];
		}
		
	}
}
