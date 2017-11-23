package com.alo.test;

public class Bit {
    /**
     * ����������ζ����Ʊ��λ����ͬ������
     * 
     * @param m ����m
     * @param n ����n
     * @return ����
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