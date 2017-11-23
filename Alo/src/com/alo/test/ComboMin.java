package com.alo.test;

import java.util.Arrays;
import java.util.Scanner;

public class ComboMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<n;i++) {
			if(a[i]>sum+1) break;
			sum+=a[i];
		}
		System.out.println(sum+1);
		sc.close();
	}
}
