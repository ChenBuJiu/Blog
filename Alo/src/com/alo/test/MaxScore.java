package com.alo.test;

import java.util.Scanner;

/**
 * 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
输入描述:
输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
输出描述:
对于每一次询问操作，在一行里面输出最高成绩.
示例1
输入

5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5
输出

5
6
5
9
 * @author Administrator
 *
 */
public class MaxScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int []a =new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		sc.nextLine();
		String[][]c = new String[m][3];
		for(int i=0;i<m;i++) {
			String []str = sc.nextLine().split(" ");
			for(int j=0;j<3;j++) c[i][j]=str[j];
		}
		/**
		 * 
测试用例:
17 9
57 6 6 49 44 38 12 41 52 43 57 21 2 20 1 30 39
Q 3 9
U 9 34
Q 14 7
U 8 78
U 5 79
Q 1 7
Q 11 4
Q 12 6
Q 13 4

对应输出应该为:

52
57
79
79
78
79

你的输出为:

52
20
		 */
		for(int i=0;i<m;i++) {
			if(c[i][0].equals("Q")) {
				int max=a[Integer.parseInt(c[i][1])-1];
				int begin;
				int end;
				if(Integer.parseInt(c[i][1])<Integer.parseInt(c[i][2])) {
					 begin = Integer.parseInt(c[i][1]);
					 end =Integer.parseInt(c[i][2]);}
				else {
					end = Integer.parseInt(c[i][1]);
					 begin =Integer.parseInt(c[i][2]);
				}
				for(int j=begin-1;j<end;j++) {
					if(max<a[j]) max=a[j];
				}
				System.out.println(max);
			}else {
				a[Integer.parseInt(c[i][1])-1]=Integer.parseInt(c[i][2]);
			}
		}
		sc.close();
	}
}
