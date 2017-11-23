package com.alo.test;

import java.util.Scanner;

public class XOR {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum =sc.nextInt();
		int count=0;
		int[]a = new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
				if((a[i]^a[j])>sum) count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
