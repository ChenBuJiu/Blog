package com.alo.test;

import java.util.Scanner;

public class DelApple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int sum=0;
		int avg=0;
		int count=0;
		int rs=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0) count++;
			sum+=a[i];
		}
		if(count!=0&&count!=a.length) {
			System.out.println(-1);
		}else {
			if(sum%a.length==0) {
				avg=sum/a.length;
				if(count==0&&avg%2==1||count==a.length&&avg%2==0) {
					for(int i=0;i<n;i++) {
						if(a[i]-avg>0) {
							rs+=(a[i]-avg)/2;
						}
					}
					System.out.println(rs);
				}else {
					System.out.println(-1);
				}
			}else {
				System.out.println(-1);
			}
		}
		
		sc.close();
	}
}
