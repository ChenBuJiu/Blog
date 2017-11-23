package com.alo.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
	现在有一个城市销售经理，需要从公司出发，去拜访市内的商家，已知他的位置以及商家的位置，但是由于城市道路交通的原因，
	他只能在左右中选择一个方向，在上下中选择一个方向，现在问他有多少种方案到达商家地址。
	给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家位置，-1代表不能经过的地区，0代表可以经过的地区，请返回方案数，保证一定存在合法路径。保证矩阵的长宽都小于等于10。
	测试样例：
	[[0,1,0],[2,0,0]],2,3
	返回：2
 * @author Administrator
 *
 */
public class MapSearch {
	public static void main(String[] args) {
		int[][] map =new int[7][5];
		new MapSearch().countPath(map, 7, 5);
	}
	/**
	 * 如果商家和经理横坐标或者纵坐标相同，方案书数1
	 * 否则，判断方位，已经理为中心，商家可能会在西北，东北，西南或者东南方向
	 * 西北：左上遍历；东北：右上遍历；西南：左下遍历；东南：右下遍历；
	 * [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,1,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,2]],7,5
	 * @param map
	 * @param n
	 * @param m
	 * @return
	 */
	public int countPath(int[][] map, int n, int m) {
		Cor man=null;
		Cor shop=null;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1) {
					man =new Cor(i,j) ;
					count++;
				}
				if(map[i][j]==2) {
					shop = new Cor(i,j);
					count++;
				}
			}
			if(count==2) break;
		}
		if(man.getX()==shop.getX()||man.getY()==shop.getY()) return 1;
		else if(man.getX()<shop.getX()){
			if(man.getY()<shop.getY()) {
				return sol(1,1,man,shop,n,m,map);
			}else {
				return sol(1,-1,man,shop,n,m,map);
			}
		}else {
			if(man.getY()>shop.getY()) {
				return sol(-1,-1,man,shop,n,m,map);
			}else {
				return sol(-1,1,man,shop,n,m,map);
			}
		}
	}
	private int sol(int i, int j,Cor man,Cor shop,int n,int m,int[][] map) {
		Queue queue =new LinkedList();
		queue.add(man);
		int rs=0;
		while(!queue.isEmpty()) {
			Cor t = (Cor) queue.poll();
			if(t.getX()+i>=0&&t.getX()+i<n&&map[t.getX()+i][t.getY()]!=-1) {
				if(map[t.getX()+i][t.getY()]==0)queue.add(new Cor(t.getX()+i,t.getY()));
				else if(map[t.getX()+i][t.getY()]==2) {
					rs++;
				}
			}
			if(t.getY()+j>=0&&t.getY()+j<m&&map[t.getX()][t.getY()+j]!=-1) {
				if(map[t.getX()][t.getY()+j]==0)queue.add(new Cor(t.getX(),t.getY()+j));
				else if(map[t.getX()][t.getY()+j]==2) {
					rs++;
				}
			}
		}
	
		return rs;
	}
	public class Cor{
		private int x;
		private int y;
		public Cor() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Cor(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
	}
}
