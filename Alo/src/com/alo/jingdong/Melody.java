package com.alo.jingdong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ʱ�����ƣ�2��
�ռ����ƣ�131072K
СQ��ţ��ʿ�ϳ�һ�׸���,���׸�����n���������,ÿ��������һ����������ʾ��
����ÿ������Ҫô��СQ�ݳ�Ҫô��ţ��ʿ�ݳ�,����һϵ�������ݳ����Ѷȵ����������������仯����֮��, ����һ������������8, 8, 13, 12, ��ô�����Ѷȵ���|8 - 8| + |13 - 8| + |12 - 13| = 6(����||��ʾ����ֵ)��
����Ҫ�԰���n�����������СQ��ţ��ʿ,�������ݳ����Ѷ�֮����С,����������С���ѶȺ��Ƕ��١�
��������ʾ: СQѡ���ݳ�{5, 6}�Ѷ�Ϊ1, ţ��ʿѡ���ݳ�{1, 2, 1}�Ѷ�Ϊ2,�Ѷ�֮��Ϊ3,��һ������С�ѶȺ͵ķ����ˡ� 
��������:
�����������,��һ��һ��������n(1 �� n �� 2000) �ڶ���n������v[i](1 �� v[i] �� 10^6), ��ʾÿ��������


�������:
���һ������,��ʾСQ��ţ��ʿ�ݳ���С���ѶȺ��Ƕ��١�

��������1:
5
1 5 6 2 1

�������1:
3
 * @author Administrator
 *
 */

public class Melody {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []a = new int[n];
		double avg=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			avg+=a[i];
		}
		avg/=n;
		int l=0,r=0,m=0;
		int []tag = new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]<avg) {
				tag[i]=-1;
				l++;
			}else if(avg<a[i]) {
				tag[i]=1;
				r++;
			}else {
				m++;
			}
		}
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		if(l>=r) {
			 left = new ArrayList<Integer>();
			 right = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				if(tag[i]==0||tag[i]==-1) {
					left.add(a[i]);
				}else {
					right.add(a[i]);
				}
			}
		}else {
			 left = new ArrayList<Integer>();
			 right = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				if(tag[i]==0||tag[i]==1) {
					right.add(a[i]);
				}else {
					left.add(a[i]);
				}
			}
		}
		int rs=0;
		for(int i=1;i<left.size();i++) {
			int temp = Math.abs(left.get(i)-left.get(i-1));
			rs+=temp;
		}
		for(int i=1;i<right.size();i++) {
			int temp = Math.abs(right.get(i)-right.get(i-1));
			rs+=temp;
		}
		System.out.println(rs);
		sc.close();
	}
}
