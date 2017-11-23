package com.alo.offer;

import java.util.Scanner;

/**
 * 使用回溯法解决子集和问题
 * 
 * @author Administrator
 *
 */
public class SubSetSum {
	static int sum = 0; 
	static int c = 0; //和的值
	static int n = 0;
	static int[] arr;
	static int[] temp;
	static int t = 0; //子集和存在那么为1，不存在为0

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		c = input.nextInt();
		arr = new int[n];
		temp = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		search(0);
		input.close();
		if (t == 0) {
			System.out.println("No Solution!");
		}
	}

	public static void search(int m) {
		if (sum == c) {
			t = 1;
			for (int i = 0; i < m; i++) {
				if (temp[i] == 1) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		if (sum > c || m == n) {
			return;
		}
		if (sum + arr[m] <= c) {
			sum += arr[m];
			temp[m] = 1;
			search(m + 1);
			temp[m] = 0;
			sum -= arr[m];
		}
		search(m + 1);
	}
}
