package com.alo.offer;

import java.util.Scanner;

/**��m����
 * ��ɫ����
 * @author Administrator
 *n�������������ͨͼ,�±��1��ʼ����������
 */
public class Color {
	int sum=0; //������
	String []colors= {"��","��","��"};//,"��","��","��","��"
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String rs[]=new String[n];
		int adjacency[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				adjacency[i][j]=sc.nextInt();
			}
		}
		new Color().backtrace(0, rs, adjacency);
		sc.close();
	}
	/**
	 * 5
0 1 1 -1 -1
1 0 1 1 0
1 1 0 1 0
-1 1 1 0 1
-1 1 -1 1 0
	 * @param t
	 * @param rs
	 * @param adjacency
	 */
	public void backtrace(int t,String []rs,int[][] adjacency) {
		int n=adjacency.length;
		if(t>n-1) {
			sum++;
			System.out.print("���ǵ�"+sum+"�ַ���:");
			for(int i=0;i<n;i++) {
				System.out.print(rs[i]+" ");
			}
			System.out.println();
		}else {
			for(int i=0;i<colors.length;i++) {
				rs[t]=colors[i];
				if(check(t,adjacency,rs)) {
					backtrace(t+1,rs,adjacency);
				}
				rs[t]=null;
			}
		}
	}
	private boolean check(int t,int [][]adjacency,String []rs) {
		// TODO Auto-generated method stub
		int n=adjacency.length;
		for(int i=0;i<n;i++) {
			if(adjacency[t][i]==1) {
				if(rs[t].equals(rs[i])) {
					return false;
				}
			}
		}
		return true;
	}
}	
