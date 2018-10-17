package qiuzhao.guoqu.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        lowUpperOrder();
        numberOfCupple();
    }

    public static void lowUpperOrder() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String s = input.nextLine();
            char[] c = s.toCharArray();
            int len = c.length;
            if (len == 0)
                System.out.println();
            int i;
            int j;
            char tmp;
            for (i = len; i >= 0; i--) {
                for (j = 0; j < i - 1; j++) {
                    if (c[j + 1] <= 'z' && c[j + 1] >= 'a' && c[j] <= 'Z' && c[j] >= 'A') {
                        tmp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = tmp;
                    }
                }
            }
            for (i = 0; i < len; i++)
                System.out.print(c[i]);
            System.out.println();
        }
    }

    public static void numberOfCupple() {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int i;
        int[] a = null;
        if (len == 0)
            System.out.println();
        for (i = 0; i < len; i++)
            a[i] = input.nextInt();
        quickSort(a, 0, len);
        //cupple of minimum

        //cupple of maximum
        //all same min=max

    }

    public static void quickSort(int[] a, int from, int to) {
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
        // low==high
        a[i] = mid;
        quickSort(a, from, j - 1);
        quickSort(a, j + 1, to);
    }
}

