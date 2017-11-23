package com.alo.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 题目描述
	给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
	输入描述:
	输入数据一个字符串，包括字母,数字等。
	输出描述:
	输出首先出现三次的那个英文字符
	示例1
	输入
	
	Have you ever gone shopping and
	输出
	
	e
 * @author Administrator
 *
 */
public class ThreeTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++) {
			char c = s.charAt(i);
			int t = c;
			if(c>='a'&&c<'z'||c>='A'&&c<='Z') {
				if(map.containsKey(t)) {
					map.put(t, map.get(t)+1);
					if(map.get(t)==3) {
						System.out.println(c);
						return;
					}
				}else {
					map.put(t, 1);
				}
			}
				
		}
		sc.close();
	}
}
