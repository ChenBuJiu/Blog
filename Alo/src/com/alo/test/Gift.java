package com.alo.test;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
    	int soldier =gifts[0];
    	int num=1;
    	for(int i=1;i<n;i++) {
    		if(gifts[i]==soldier) {
    			num++;
    		}else {
    			if(num>0) {
    				num--;
    			}else {
    				soldier=gifts[i];
    				num++;
    			}
    		}
    	}
    	int rs=0;
    	for(int i=0;i<n;i++) if(soldier==gifts[i])rs++;
    	if(rs>n/2) {
    		return soldier;
    	}else {
    		return 0;
    	}
    }
}