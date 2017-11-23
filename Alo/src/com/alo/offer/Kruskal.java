package com.alo.offer;

import java.util.Scanner;
public class Kruskal {
	static final int MAX=Integer.MAX_VALUE;//��ʾ����֮�� ����������,���Ӿ������Լ����Լ��ľ���Ϊ0
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]adjacency = new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				adjacency[i][j]=sc.nextInt();
			}
		}
		int sum = Kruskal(adjacency,n);
		System.out.println("��Сsum = "+sum);
		sc.close();
	}
	
	public static int Kruskal(int [][]adjacency,int n) {
		boolean flag =false;
		int sum=0,from=0,to=0;
		int []join = new int[n];//��ʶ����
		int joinNum=1;
		while(!flag) {
			int min = MAX;
			for(int i=0;i<n;i++) { //����û�жԱ�Ȩֵ���������ٶȻ����
				for(int j=0;j<n;j++){
					if(adjacency[i][j]>0&&min>adjacency[i][j]) {
						if(join[i]!=join[j]||join[i]==0&&join[j]==0) {
							min=adjacency[i][j];
							from=i;
							to=j;
						}
					}
				}
			}
			if(min==MAX) {
				continue;
			}
			System.out.println(from+"��"+to+"����Ϊ:"+min);
			sum+=min;
			if(join[from]==0&&join[to]==0) { //�����㶼û�м��룬������Ϊͬһ����
				join[from]=join[to]=++joinNum;
			}else if(join[from]>0&&join[to]>0) {//���������ĺϲ���ѡ�����������ֵ�һ�����ı�ʶ��Ϊ�ϲ���������ı�ʶ
				int temp=join[from];
				for(int k=0;k<n;k++) {
					if(join[k]==temp) {
						join[k]=join[to];
					}
				}
			}else {//������ǽ�һ�����뵽һ����������ȥ����ʶΪ��������ı�ʶ
				if(join[from]==0) { 
					join[from]=join[to];
				}else {
					join[to]=join[from];
				}
			}
			for(int k=1;k<n;k++) {
				if(join[0]!=join[k]) {//����������һ��Ҫ�ܽ����е����������С�����������򣬴˴����û�е��0��ͨ�����ᵼ������ѭ����
					flag=false;
					break;
				}else {
					flag=true;
				}
			}
			if(flag) {
				break;
			}
			
		}
		return sum;
	}
}