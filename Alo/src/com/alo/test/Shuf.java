package com.alo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * ��Ŀ����
	ϴ����������ʮ�ֳ�����������Ҫдһ������ģ��ϴ�ƵĹ��̡� ������Ҫϴ2n���ƣ����ϵ��������ǵ�1�ţ���2�ţ���3��һֱ����2n�š����ȣ����ǰ���2n���Ʒֳ����ѣ��������ŵ�1�ŵ���n�ţ��ϰ�ѣ����������ŵ�n+1�ŵ���2n�ţ��°�ѣ������žͿ�ʼϴ�ƵĹ��̣��ȷ������ֵ����һ���ƣ��ٷ������ֵ����һ���ƣ����ŷ������ֵĵ����ڶ����ƣ��ٷ������ֵĵ����ڶ����ƣ�ֱ�����������ֵĵ�һ���ơ����Ű��ƺϲ������Ϳ����ˡ� ������6���ƣ��ʼ�Ƶ�������1,2,3,4,5,6�����ȷֳ����飬��������1,2,3����������4,5,6����ϴ�ƹ����а�˳�������6,3,5,2,4,1�������������ٴκϳ�һ����֮�����ǰ��մ������µ�˳�������ƣ��ͱ��������1,4,2,5,3,6�� ���ڸ���һ��ԭʼ���飬������⸱��ϴ��k��֮��������µ����С�
	��������:
	��һ��һ����T(T �� 100)����ʾ��������������ÿ�����ݣ���һ��������n,k(1 �� n,k �� 100)��������һ����2n����a1,a2,...,a2n(1 �� ai �� 1000000000)����ʾԭʼ������ϵ��µ����С�
	�������:
	����ÿ�����ݣ����һ�У����յ����С�����֮���ÿո��������Ҫ����ĩ�������Ŀո�
	ʾ��1
	����
	
	3
	3 1
	1 2 3 4 5 6
	3 2
	1 2 3 4 5 6
	2 2
	1 1 1 1
	���
	
	1 4 2 5 3 6
	1 5 4 3 2 6
	1 1 1 1
 * @author Administrator
 *
 */
public class Shuf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			int len = sc.nextInt();
			int cishu = sc.nextInt();
			int []top=new int[len];
			int []bot=new int[len];
			for(int j=0;j<len;j++) {
				top[j]=sc.nextInt();
			}
			for(int j=0;j<len;j++) {
				bot[j]=sc.nextInt();
			}
			list.add(sol(top,bot,cishu));
			
		}
		Iterator it = list.iterator();
		while(it.hasNext()) {
			int []rs =(int[]) it.next();
			StringBuffer sb = new StringBuffer();
			for(int i:rs) {
				sb.append(i+" ");
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
			}
		sc.close();
		}
	
	public static int[] sol(int []l,int []r,int k) {
		int[] rs = new int[l.length*2];
		for(int i=2*l.length-1;i>=0;i--) {
			if(i%2==1) rs[i]=r[i/2];
			else rs[i]=l[i/2];
		}
		for(int i=0;i<l.length*2-1;i++) {
			if(i<l.length) l[i]=rs[i];
			else r[i-l.length]=rs[i];
		}
		if(k>1) {
			rs = sol(l,r,k-1);
		}
		
		return rs;
	}
}
;