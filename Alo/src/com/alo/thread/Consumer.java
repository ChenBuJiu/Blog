package com.alo.thread;

import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//快递员从快递单号的池子中取单号
public class Consumer implements Runnable{

	private HashSet<Integer> set = new HashSet<Integer>();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.get(set);
		
	}
	
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consumer(HashSet<Integer> set) {
		super();
		// TODO Auto-generated constructor stub
		this.set = set;
	}
	private void get(HashSet<Integer> set) {
		Random random = new Random();
		for(int i=0;i<6;i++) {
			int temp = random.nextInt(100);
			System.out.println(Thread.currentThread().getName()+"将要获得："+temp);
			set.remove(temp);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(100);
		for(int i=0;i<10;i++) {
			es.execute(new Consumer(Data.getData()));
		}
		es.shutdown();
	}
	
}
