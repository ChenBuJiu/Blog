package com.alo.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 
 * ��Ŀ����
	18λ���֤�ı�������ǣ�
	ǰ1��2λ���ֱ�ʾ������ʡ��ֱϽ�С����������Ĵ���
	��3��4λ���ֱ�ʾ�����ڵؼ��У������ݣ��Ĵ���
	��5��6λ���ֱ�ʾ�����������ء������ء��ؼ��У��Ĵ��룻
	��7��14λ���ֱ�ʾ�������ꡢ�¡��գ�
	��15��16λ���ֱ�ʾ�����ڵص��ɳ����Ĵ��룻
	��17λ���ֱ�ʾ�Ա�������ʾ���ԣ�ż����ʾŮ�ԣ�
	��18λ������У���룬�����������֤����ȷ�ԡ�
	�û����������֤�Ĺ����о������������Ϊ�˷����û���ȷ������Ҫ����������ж��û������밴�� 6+8+4 �ĸ�ʽ���з��飬ʵ��һ������������������е����֤�ţ����ط������ַ�
	��������:
	���������ж��У�ÿһ����һ����������е����֤��
	�������:
	�������ַ���
	ʾ��1
	����
	
	5021
	502104 198803
	5021041988033084
	502104198803308324
	���
	
	5021
	502104 198803
	502104 19880330 84
	502104 19880330 8324
 */
public class Identity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new LinkedList();
		while(sc.hasNextLine()) {
			StringBuffer s = new StringBuffer(sc.nextLine());
			int len = s.length();
			if(len<=6) {
				q.add(s.toString());
			}else if(len<=14){
				q.add(s.substring(0, 6)+" "+s.substring(6));
			}
			else {
				q.add(s.substring(0, 6)+" "+s.substring(6,14)+" "+s.substring(14));
			}
		}
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		sc.close();
	}
}
