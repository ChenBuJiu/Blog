package com.alo.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i=0;i<n;i++) tree.add(sc.nextInt());
		for(int i=0;i<m;i++) tree.add(sc.nextInt());
		Iterator<Integer> it = tree.iterator();
		int size =0;
		while(it.hasNext()) {
			size++;
			if(size==tree.size()) System.out.println(it.next());
			System.out.print(it.next()+" ");
			
		}
		sc.close();
	}
}
