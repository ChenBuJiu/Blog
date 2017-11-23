package com.alo.test;

import java.util.*;

public class Bucket {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++)
                data[i] = in.nextInt();
            System.out.println(MaxDis(data, n));
        }
        in.close();
    }
     
    public static int MaxDis(int[] A, int n) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(A[i], max);
            min = Math.min(A[i], min);
        }
        int d = (max - min) / n;
        int[] Max = new int[n + 1];
        int[] Min = new int[n + 1];
        Max[0] = Min[0] = min;
        Max[n] = Min[n] = max;
        for (int i = 0; i < n; i++) {
          if (A[i] != max && A[i] != min) {
            Max[(A[i] - min) / d] = Math.max(Max[(A[i] - min) / d], A[i]);
                if (Min[(A[i] - min) / d] == 0)
                    Min[(A[i] - min) / d] = A[i];
                else
                    Min[(A[i] - min) / d] = Math.min(Min[(A[i] - min) / d], A[i]);
          }
        }
        int count = 0;
        int res = 0;
        int start = 1;
        for (int i = 1; i < n; i++) {
            count = 0;
            while (Max[i] == 0) {
                count++;
                i++;
                start = i;
            }
            res = Math.max(count, res);
        }
        return Min[start] - Max[start - res - 1];
    }
}
