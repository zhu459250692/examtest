package qiuzhao.guoqu.tencentqiuzhao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int length = 0;
        for (; x > 0; x--) {
            int result = 0;
            y = input.nextInt();
            length = y;
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (y < 3) {
                System.out.println(0);
                continue;
            }
            Integer[] arr = new Integer[y];
            for (i = 0; y > 0; y--, i++)
                arr[i] = input.nextInt();
            quickSort(arr, 0, y - 1);
            for (i = 0; i < length - 2; i++)
                for (j = i + 1; j < length - 1; j++)
                    for (k = j + 1; k < length; k++) {
                        a = arr[i];
                        b = arr[j];
                        c = arr[k];
                        if ((a + b) > c && (b + c) > a) {
                            result++;
                        } else
                            break;
                    }
            System.out.println(result);
        }

    }

    public static void quickSort(Integer[] a, int from, int to) {
        if (to - from <= 0)
            return;
        int i = from;
        int j = to;
        int mid = a[from];
        while (i < j) {
            while (i < j && a[j] > mid)
                j--;
            if (i < j) {
                a[i++] = a[j];
            }
            while (i < j && a[i] < mid)
                i++;
            if (i < j) {
                a[j--] = a[i];
            }
        }
        // low==high,i==j
        a[i] = mid;
        quickSort(a, from, j - 1);
        quickSort(a, j + 1, to);
    }
}
