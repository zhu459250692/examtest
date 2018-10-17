package qiuzhao.guoqu.jingdongexam.main1;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float res;
        int length = 0;
        length = in.nextInt();
        int[] a = new int[length];
        int i = 0;
        while (i < length) {
            a[i++] = in.nextInt();
        }
        Arrays.sort(a);
        if (length % 2 == 1) {
            res = a[length / 2];
        } else{
            res = (a[length / 2 - 1] + a[length / 2]) / 2.0f;
        }
        if(Math.ceil(res)==res){
            System.out.println((int)res);
        }
        else
            System.out.println(res);

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


