package com.alo.test;

import java.util.Scanner;

/**
 * ��Ŀ����
	���������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ������磬���롱They are students.���͡�aeiou������ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.��
	��������:
	ÿ�������������2���ַ���
	�������:
	���ɾ������ַ���
	ʾ��1
	����
	
	They are students.
	aeiou
	���
	
	Thy r stdnts.
 * @author Administrator
 *
 */
public class RmSame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ori =sc.nextLine();
		String del =sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ori.length();i++) {
			if(del.indexOf(ori.charAt(i))!=-1) continue;
			else {
				sb.append(ori.charAt(i));
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
