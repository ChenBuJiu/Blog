package com.alo.test;

import java.util.HashSet;
import java.util.Scanner;

public class HashShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		while(sc.hasNextLine()) {
			String []str = sc.nextLine().split(" ");
			for(String s:str) set.add(s);
		}
		System.out.println(set.size());
		sc.close();
	}
}
