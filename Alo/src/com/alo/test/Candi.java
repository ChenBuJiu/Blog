package com.alo.test;

import java.util.Scanner;

/**
 * A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,��������֪�����µ���Ϣ��
	A - B, B - C, A + B, B + C. ���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.
	������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C�����ﱣ֤���ֻ��һ������A,B,C������������������
	��������:
	����Ϊһ�У�һ��4���������ֱ�ΪA - B��B - C��A + B��B + C���ÿո������
	��Χ����-30��30֮��(������)��
	�������:
	���Ϊһ�У�����������������A��B��C��˳�����A��B��C���ÿո��������ĩ�޿ո�
	�������������������A��B��C�������No
	ʾ��1
	����
	
	1 -2 3 4
	���
	
	2 1 3
 * @author Administrator
 *
 */
public class Candi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d =sc.nextInt();
		
			if((a+c)%2==0&&(b+d)%2==0&&(d-b)%2==0) {
				int A =(a+c)/2;
				int B=(b+d)/2;
				int C=(b-d)/2;
				System.out.println(A+" "+B+" "+C);
			}
			else {
				System.out.println("No");
			}
			sc.close();
		}
	}

