package com.alo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		cre(3,list,"");
		Collections.sort(list);
		String[]str=(String[]) list.toArray();
		System.out.println(str[index]);
		sc.close();
	}
	public static void cre(int n,ArrayList<String> list,String ori) {
		for(char i='a';i<'z';i++) {
			if(n==1) list.add(ori+i);
			else  {
				ori=i+ori;
				cre(n-1,list,ori);
			}
		}
	}
}
