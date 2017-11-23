package com.alo.offer;
/**
 * 非递归的二分查找
 * 适用于已经排序好的数组进行查找
 * @author Administrator
 *
 */
public class BinarySearch{
	public static void main(String[] args) {
		int []a= {1,5,9,17,56,89,123,257,368,489,578,684,784,857,942};
		System.out.println(new BinarySearch().searchNoRecur(a, 9));
		System.out.println(new BinarySearch().search(a, 9, 0, a.length-1));
	}
	public int searchNoRecur(int []a,int x) {
		int low=0,high=a.length-1;
		int mid=0;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(x==a[mid]) {
				return mid;
			}else if(x>a[mid]){
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return -1;
	}
	public int search(int []a,int x,int low ,int high) {
		if(low>high) return -1;
		int mid =low+(high-low)/2;
		if(a[mid]==x) {
			return mid;
		}else if(x>a[mid]){
			return search(a,x,mid+1,high);
		}else {
			return search(a,x,low,mid-1 );
		}
	}
}
