package com.alo.offer;

import java.util.Arrays;
import java.util.Collections;

public class Recall {
	private Goods goods[] ;
	private int totalWeight;
	private int currentWeight;
	private int n;
	private int bestValue;
	private int currentValue;
	public Recall(Goods[] goods, int totalWeight, int n) {
		super();
		this.goods = goods;
		this.totalWeight = totalWeight;
		this.n = n;
		Arrays.sort(goods,Collections.reverseOrder());
	}
	
	public int solve(int i) {
		if(i>=n) {
			bestValue=currentValue;
			return bestValue;
		}
		if(currentWeight+goods[i].getWeight()<=totalWeight) {
			currentWeight+=goods[i].getWeight();
			currentValue+=goods[i].getValue();
			bestValue=solve(i+1);
			currentWeight-=goods[i].getWeight();
			currentValue-=goods[i].getValue();
		}
		if(currentValue+getSurplusValue(i+1)>bestValue) {
			bestValue=solve(i+1);
		}
		return bestValue;
	}
	private int getSurplusValue(int i) {
		// TODO Auto-generated method stub
		int surplusValue=0;
		for(int j=i;j<n;j++) {
			surplusValue+=goods[j].getValue();
		}
		return surplusValue;
	}
	public static void main(String[] args) {
	    Goods[] bags = new Goods[] { new Goods(2, 13),  
	            new Goods(1, 10), new Goods(3, 24), new Goods(2, 15),  
	            new Goods(4, 28), new Goods(5, 33), new Goods(3, 20),  
	            new Goods(1, 8) };  
	    int totalWeight = 12;  
	    Recall problem = new Recall(bags, totalWeight,bags.length);  
	  
	    System.out.println(problem.solve(0)); 
	}
}
