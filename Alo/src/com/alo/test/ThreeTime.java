package com.alo.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ��Ŀ����
	����һ��Ӣ���ַ���,��дһ�δ����ҳ�����ַ��������ȳ������ε��Ǹ�Ӣ���ַ���
	��������:
	��������һ���ַ�����������ĸ,���ֵȡ�
	�������:
	������ȳ������ε��Ǹ�Ӣ���ַ�
	ʾ��1
	����
	
	Have you ever gone shopping and
	���
	
	e
 * @author Administrator
 *
 */
public class ThreeTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++) {
			char c = s.charAt(i);
			int t = c;
			if(c>='a'&&c<'z'||c>='A'&&c<='Z') {
				if(map.containsKey(t)) {
					map.put(t, map.get(t)+1);
					if(map.get(t)==3) {
						System.out.println(c);
						return;
					}
				}else {
					map.put(t, 1);
				}
			}
				
		}
		sc.close();
	}
}
