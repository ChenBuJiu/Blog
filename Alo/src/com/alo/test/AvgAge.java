package com.alo.test;

import java.util.Scanner;

/**
 * 题目描述
	已知某公司总人数为W，平均年龄为Y岁(每年3月末计算，同时每年3月初入职新人)，假设每年离职率为x，x>0&&x<1,每年保持所有员工总数不变进行招聘，新员工平均年龄21岁。 
	从今年3月末开始，请实现一个算法，可以计算出第N年后公司员工的平均年龄。(最后结果向上取整)。
	输入描述:
	输入W Y x N
	输出描述:
	输出第N年后的平均年龄
	示例1
	输入
	
	5 5 0.2 3
	输出
	
	15

 *
 */
public class AvgAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int w = sc.nextInt();
			double y = sc.nextDouble();
			double x = sc.nextDouble();
			int n = sc.nextInt();
			System.out.println((int)Math.ceil(sol(w,y,x,n)));
		}
		sc.close();
	}
	public static double sol(int w,double y,double x,int n) {
		y=((w-w*x)*(y+1)+w*x*21)/w;
		if(n==1) return y;
		else {
			return sol(w,y,x,n-1);
		}
	}
}
