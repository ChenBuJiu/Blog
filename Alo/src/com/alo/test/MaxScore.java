package com.alo.test;

import java.util.Scanner;

/**
 * ��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ���Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�.
��������:
�����������������ݡ�
ÿ�������һ��������������N��M��0 < N <= 30000,0 < M < 5000��,�ֱ����ѧ������Ŀ�Ͳ�������Ŀ��
ѧ��ID��Ŵ�1�ൽN��
�ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ�
��������M�У�ÿһ����һ���ַ�C��ֻȡ��Q����U������������������A,B,��CΪ'Q'��ʱ��, ��ʾ����һ��ѯ�ʲ�������ѯ��ID��A��B������A,B����ѧ�����У��ɼ���ߵ��Ƕ���
��CΪ��U����ʱ�򣬱�ʾ����һ�����²�����Ҫ���IDΪA��ѧ���ĳɼ�����ΪB��
�������:
����ÿһ��ѯ�ʲ�������һ�����������߳ɼ�.
ʾ��1
����

5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5
���

5
6
5
9
 * @author Administrator
 *
 */
public class MaxScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int []a =new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		sc.nextLine();
		String[][]c = new String[m][3];
		for(int i=0;i<m;i++) {
			String []str = sc.nextLine().split(" ");
			for(int j=0;j<3;j++) c[i][j]=str[j];
		}
		/**
		 * 
��������:
17 9
57 6 6 49 44 38 12 41 52 43 57 21 2 20 1 30 39
Q 3 9
U 9 34
Q 14 7
U 8 78
U 5 79
Q 1 7
Q 11 4
Q 12 6
Q 13 4

��Ӧ���Ӧ��Ϊ:

52
57
79
79
78
79

������Ϊ:

52
20
		 */
		for(int i=0;i<m;i++) {
			if(c[i][0].equals("Q")) {
				int max=a[Integer.parseInt(c[i][1])-1];
				int begin;
				int end;
				if(Integer.parseInt(c[i][1])<Integer.parseInt(c[i][2])) {
					 begin = Integer.parseInt(c[i][1]);
					 end =Integer.parseInt(c[i][2]);}
				else {
					end = Integer.parseInt(c[i][1]);
					 begin =Integer.parseInt(c[i][2]);
				}
				for(int j=begin-1;j<end;j++) {
					if(max<a[j]) max=a[j];
				}
				System.out.println(max);
			}else {
				a[Integer.parseInt(c[i][1])-1]=Integer.parseInt(c[i][2]);
			}
		}
		sc.close();
	}
}
