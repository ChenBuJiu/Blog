package com.alo.test;

import java.util.Scanner;

/**
 * �����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ��������ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ������յ�ʱ�����õ���������ֱ����ַ���A���ַ���B���������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ�������ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ�������ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��
	���磺
	A = ��aba����B = ��b����������4�ְ�B����A�İ취��
	* ��A�ĵ�һ����ĸ֮ǰ: "baba" ���ǻ��� 
	* �ڵ�һ����ĸ��a��֮��: "abba" �ǻ��� 
	* ����ĸ��b��֮��: "abba" �ǻ��� 
	* �ڵڶ�����ĸ'a'֮�� "abab" ���ǻ��� 
	�������������Ĵ�Ϊ2
	��������:
	ÿ���������ݹ����С�
	��һ��Ϊ�ַ���A
	�ڶ���Ϊ�ַ���B
	�ַ������Ⱦ�С��100��ֻ����Сд��ĸ
	�������:
	���һ�����֣���ʾ���ַ���B�����ַ���A֮�󹹳�һ�����Ĵ��ķ�����
	ʾ��1
	����
	
	aba
	b
	���
	
	2
 * @author Administrator
 *4
EIGHT
ZEROTWOONE
OHWETENRTEO
OHEWTIEGTHENRTEO
���

0
234
345
0345
 */
public class InsertHuiWen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer ori = new StringBuffer(sc.nextLine());
		String ins = sc.nextLine();
		String back=ori.toString();
		int count=0;
		int len = ori.length();
		for(int i=0;i<=len;i++) {
			ori.insert(i, ins.toCharArray());
			String temp=ori.toString();
			ori.reverse();
			if(temp.equals(ori.toString())) {
				count++;
			}
			ori=new StringBuffer(back);
		}
		System.out.println(count);
		sc.close();
	}
}
