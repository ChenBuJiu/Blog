package com.alo.test;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []back=new String[n];
		String []strs = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			strs[i]=sc.nextLine();
			back[i]=strs[i];
		}
		boolean flag1=true;
		for(int i=1;i<n;i++) {
			if(strs[i].length()>strs[i-1].length()) continue;
			else {
				flag1=false;
				break;
			}
		}
		Arrays.sort(back);
		boolean flag2=true;
		for(int i=0;i<n;i++) {
			if(strs[i].equals(back[i])) {
				continue;
			}else {
				flag2=false;
				break;
			}
		}
		if(flag1&&flag2) {
			System.out.println("both");
		}else if(flag1) {
			System.out.println("lengths");
		}else if(flag2) {
			System.out.println("lexicographically");
		}else {
			System.out.println("none");
		}
		sc.close();
	}
}
