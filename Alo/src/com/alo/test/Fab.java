package com.alo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fab {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int left =list.get(0);
		int right =list.get(1);
		while(true) {
			if(n>=left&&n<right) {
				break;
			}
			list.add(left+right);
			right=list.get(list.size()-1);
			left=list.get(list.size()-2);
		}
		System.out.println(Math.min(n-left, right-n));
	}
	
}
