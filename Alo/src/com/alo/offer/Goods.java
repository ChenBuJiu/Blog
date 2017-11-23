package com.alo.offer;

import java.util.Collections;

public class Goods implements Comparable<Goods>{
	private int weight;
	private int value;
	private double unitValue;
	public Goods(int weight, int value) {
		super();
		this.weight = weight;
		this.value = value;
		this.unitValue=(weight==0)?0:value/weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public double getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}
	@Override
	public int compareTo(Goods knapsack) {
		// TODO Auto-generated method stub
		Collections.reverseOrder();
		double value=knapsack.getUnitValue();
		if(this.unitValue>value) {
			return 1;
		}else if(this.unitValue<value) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
