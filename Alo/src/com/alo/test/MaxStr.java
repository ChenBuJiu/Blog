package com.alo.test;

import java.util.Scanner;
//abcd12345ed125ss123456789
//abcd12345ed125ss123456789
public class MaxStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char []c = sc.nextLine().toCharArray();
		int n = c.length;
		int [][]a=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			if(c[i]>='a'&&c[i]<='z') break;
				a[i][i]=1;
			
			
		}
		int max = 0;
		int end=0;
		for(int i=1;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(c[j]>='0'&&c[j]<='9') {
					a[i][j]=a[i][j-1]+1;
					if(max<a[i][j]) {
						max=a[i][j];
						end=j-1;
					}
				}
				else {
					continue;
				}
			}
		}
		for(int i=end-max+2;i<=end+1;i++)System.out.print(c[i]);
		sc.close();
	}
}
