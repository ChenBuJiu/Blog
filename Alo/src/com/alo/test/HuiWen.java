package com.alo.test;
import java.util.LinkedList;
/**
 * ��Ŀ����
���һ��������������֮���ԭ������һ���ľͳ���������������Ϊ�������С����磺
{1, 2, 1}, {15, 78, 78, 15} , {112} �ǻ�������, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} ���ǻ������С�
���ڸ���һ���������У�����ʹ��һ��ת��������
ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�
��������:
����Ϊ���У���һ��Ϊ���г���n ( 1 �� n �� 50)
�ڶ���Ϊ�����е�n������item[i]  (1 �� iteam[i] �� 1000)���Կո�ָ���
�������:
���һ��������ʾ������Ҫ��ת������
ʾ��1
����

4
1 1 1 3
���

2
 */
import java.util.Scanner;

public class HuiWen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String []str = sc.nextLine().split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s:str) sb.append(s);
		int i=0,j=sb.length()-1;
		int count=0;
		while(i!=j) {
			if(sb.charAt(i)==sb.charAt(j)) {
				sb.deleteCharAt(j);
				sb.deleteCharAt(i);
			}else if(sb.charAt(i)<sb.charAt(j)){
				int t = Integer.parseInt(sb.charAt(i)+"")+Integer.parseInt(sb.charAt(i+1)+"");
				sb.delete(i, i+2);
				sb.insert(0, t);
				count++;
			}else {
				int t = Integer.parseInt(sb.charAt(j)+"")+Integer.parseInt(sb.charAt(j-1)+"");
				sb.delete(j-1, j+1);
				sb.insert(0, t);
				count++;
			}
			if(sb.length()==0) break;
			j=sb.length()-1;
		}
		System.out.println(count);
		sc.close();
	}
}
