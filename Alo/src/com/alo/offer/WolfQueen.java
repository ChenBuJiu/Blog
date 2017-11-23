package com.alo.offer;

public class WolfQueen {
    /**
     * һ���ж��ٸ��ʺ󣨴�ʱ����Ϊ8�ʺ���8X8���̣������޸Ĵ�ֵ������N�ʺ����⣩
     */
    int max = 8;
    /**
     * �����鱣��������һ���ʺ����array[0]�У��ڶ�������array[1]��
     */
    int[] array = new int[max];

    public static void main(String[] args) {
        new WolfQueen().check(0);
    }

    /**
     * n����ǰ�ǵڼ����ʺ�
     * @param n
     * �ʺ�n��array[n]��
     */
    int []a = {0,1,2,3,4,5,6,7};
    private void check(int n) {
        //��ֹ���������һ���Ѿ����꣬����ÿ��һ������У���Ƿ��г�ͻ������ֻҪ���һ�а��꣬˵���Ѿ��õ���һ����ȷ��
        if (n == max) {
            print();
            return;
        }
        //�ӵ�һ�п�ʼ��ֵ��Ȼ���ж��Ƿ�ͱ��б��б�б���г�ͻ�����OK���ͽ�����һ�е��߼�
        for (int i = n; i < max; i++) {
        	array[n] = a[i];
        	swap(a,n,i);
            if (judge(n)) {
                check(n + 1);
            }
            swap(a,n,i);
        }
    }

    private void swap(int []a,int i,int j) {
		// TODO Auto-generated method stub
    	int temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
		
	}

	private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if ( Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }
	
	int k=0;
    private void print()  {
    	++k;
    	System.out.print("���ǵ�"+k+"�ֽⷨ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + 1 + " ");
        }
        System.out.println();
    }
}
