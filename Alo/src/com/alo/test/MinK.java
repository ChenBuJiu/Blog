package com.alo.test;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 题目描述
	找出n个数里最小的k个
	输入描述:
	每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
	不超过100。
	输出描述:
	输出n个整数里最小的k个数。升序输出
	示例1
	输入
	
	3 9 6 8 -10 7 -11 19 30 12 23 5
	输出
	
	-11 -10 3 6 7
 * @author Administrator
 *
 */
public class MinK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []str = sc.nextLine().split(" ");
		int k =Integer.parseInt(str[str.length-1]);
		int toInt[] = new int[str.length-1] ;
		for(int i=0;i<str.length-1;i++)  toInt[i]=Integer.parseInt(str[i]);
		Arrays.sort(toInt);
		int[] rs = Arrays.copyOfRange(toInt, 0, k);
		for(int i=0;i<k-1;i++) System.out.print(rs[i]+" ");
		System.out.print(rs[k-1]);
		sc.close();
	}
}
