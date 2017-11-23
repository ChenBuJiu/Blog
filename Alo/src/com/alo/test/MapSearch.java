package com.alo.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ��Ŀ����
	������һ���������۾�����Ҫ�ӹ�˾������ȥ�ݷ����ڵ��̼ң���֪����λ���Լ��̼ҵ�λ�ã��������ڳ��е�·��ͨ��ԭ��
	��ֻ����������ѡ��һ��������������ѡ��һ���������������ж����ַ��������̼ҵ�ַ��
	����һ����ͼmap�����ĳ���n��m������1������λ�ã�2�����̼�λ�ã�-1�����ܾ����ĵ�����0������Ծ����ĵ������뷵�ط���������֤һ�����ںϷ�·������֤����ĳ���С�ڵ���10��
	����������
	[[0,1,0],[2,0,0]],2,3
	���أ�2
 * @author Administrator
 *
 */
public class MapSearch {
	public static void main(String[] args) {
		int[][] map =new int[7][5];
		new MapSearch().countPath(map, 7, 5);
	}
	/**
	 * ����̼Һ;�������������������ͬ����������1
	 * �����жϷ�λ���Ѿ���Ϊ���ģ��̼ҿ��ܻ������������������ϻ��߶��Ϸ���
	 * ���������ϱ��������������ϱ��������ϣ����±��������ϣ����±�����
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
