package com.alo.test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ��Ŀ����
	���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
	��������:
	���������ж��飬ÿ��ռһ�У�����������n��n < 10000����m(m < 1000)��ɣ�n��m�ĺ�����ǰ������
	�������:
	����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС����
	ʾ��1
	����
	
	81 4
	2 2
	���
	
	94.73
	3.41
 * @author Administrator
 *
 */
public class Sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double n = sc.nextDouble();
			int m= sc.nextInt();
			double temp=n;
			double sum=temp;
			for(int i=1;i<m;i++) {
				temp=Math.sqrt(temp);
				sum+=temp;
			}
			DecimalFormat fmt = new DecimalFormat("#.00");
			System.out.println(fmt.format(sum));
		}
		sc.close();
		
	}
}
