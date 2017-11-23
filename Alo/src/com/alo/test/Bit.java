package com.alo.test;

public class Bit {
    /**
     * 获得两个整形二进制表达位数不同的数量
     * 
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {
    	int rs = m^n;
    	int count=0;
    	while(rs>0) {
    		count++;
    		rs=rs&(rs-1);
    	}
    	return count;
    }
    public static void main(String[] args) {
		System.out.println(new Bit().countBitDiff(1999, 2299));
	}
}