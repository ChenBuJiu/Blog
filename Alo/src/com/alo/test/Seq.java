package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	ţţ�õ���һ���ر�ͼ��˳�Ųر�ͼ��ָʾ��ţţ������һ���ر��У��ر�������һ�����أ�����ÿ�λ���ʾ�����ַ��� s �� t�����ݹ��ϵĴ�˵��ţţ��Ҫÿ�ζ��ش� t �Ƿ��� s �������С�ע�⣬�����в�Ҫ����ԭ�ַ������������ģ����紮 abc�����������о��� {�մ�, a, b, c, ab, ac, bc, abc} 8 �֡�
	��������:
	ÿ���������һ������������ÿ�����������������г��Ȳ����� 10 �Ĳ������ո�Ŀɼ� ASCII �ַ�����
	�������:
	���һ�� ��Yes�� ���� ��No�� ��ʾ�����
	ʾ��1
	����
	
	x.nowcoder.com
	ooo
	���
	
	Yes
 * @author Administrator
 *
 */
public class Seq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ori = sc.nextLine();
		String sub =sc.nextLine();
		sc.close();
		int tag=0;
		boolean flag=false;
		for(int j=0;j<sub.length();j++) {
			
			for(int i=tag;i<ori.length();i++) {
				if(ori.charAt(i)==sub.charAt(j)) {
					tag=i+1;
					break;
				}
				if(i==ori.length()-1) {
					flag=true;
					System.out.println("No");
				}
			}
			if(flag) return;
		}
		System.out.println("Yes");
		sc.close();
	}
}
