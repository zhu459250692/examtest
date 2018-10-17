package qiuzhao.guoqu.shangtang;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        Boolean flag = true;
        for (int j = 0; j < num; j++) {
            flag = true;
            for (int deep = 0; deep < arr[j]; ) {
                if (flag) {
                    deep = deep + A;
                    flag = !flag;
                } else {
                    deep = deep + B;
                    flag = !flag;
                }
            }
            if (j < num - 1) {
                if (!flag)
                    System.out.print(1 + " ");
                else
                    System.out.print(-1 + " ");
            } else {
                if (!flag)
                    System.out.print(1);
                else
                    System.out.print(-1);
            }

        }


    }
}
