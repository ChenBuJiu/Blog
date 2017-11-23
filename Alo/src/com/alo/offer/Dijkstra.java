package com.alo.offer;
/**
 * �����Ԫ���·������
 * @author Administrator
 *
 */
public class Dijkstra {
	static final int MAX=Integer.MAX_VALUE;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] weight = {//�ڽӾ���
                {0,1,4,4},{MAX,0,1,2},{MAX,MAX,0,MAX},{MAX,MAX,MAX,0}
        };
        int start=0;
        int[] shortPath = dijkstar(weight,start);
        
        for(int i = 0;i < shortPath.length;i++)
             System.out.println("��"+(start+1)+"������"+(i+1)+"����̾���Ϊ��"+shortPath[i]);  
          
    }
	public static int[] dijkstar(int [][]weight,int start) {
		int n = weight.length;
		int [] shortPath = new int[n]; //���start�����������̾���
		int [] visited = new int[n];
		shortPath[start]=0;
		visited[start]=1;
		for(int i=1;i<n;i++) {
			int min = MAX;
			int k=-1;
			for(int j=0;j<n;j++) {
				if(visited[j]==0&&min>weight[start][j]) {
					min = weight[start][j];
					k = j;
				}
			}
			shortPath[k]=min;
			visited[k]=1;
			for(int j=0;j<n;j++) {
				if(visited[j]==0&&weight[k][j]!=MAX&&weight[start][k]+weight[k][j]<weight[start][j]) {
					weight[start][j]=weight[start][k]+weight[k][j];
				}
			}
		}
		return shortPath;
	}
}
