package qiuzhao.guoqu.shangtang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();
        if (right == 0) {
            System.out.println(0);
            return;
        }
//        int i = right;
//        int fenzi = 1;
//        int fenmu = 1;
//        for (; i > 0; i--) {
//            fenzi = fenzi * left--;
//        }
//        while (right > 0) {
//            fenmu = fenmu * right--;
//        }
//        System.out.println(fenzi / fenmu);
        int[] nnn = new int[1];
        printPar(right, right, right, nnn);
        int res = nnn[0];
        System.out.println("res"+res);
        int shengxia = left - right;
        //x=right*2+1,y=shengxia
        int x = right * 2 + 1;
        int i = shengxia;
        int fenzi = 1;
        int fenmu = 1;
        for (; i > 0; i--) {
            fenzi = fenzi * x--;
        }
        while (shengxia > 0) {
            fenmu = fenmu * shengxia--;
        }
        res = res * (fenzi / fenmu);
        System.out.println(res);
//        System.out.println(parenthesisArrayCount(4, 4, 4, 0)[0]);
//        int[] nnn = new int[1];
//        printPar(4, 4, 0,nnn);
//        System.out.println(nnn[0]);
    }


    public static void printPar(int l, int r, int count, int[] num) {
        if (l < 0 || r < l) {
            return;
        }
        if (l == 0 && r == 0) {
            num[0]++;
        } else {
            if (l > 0) {
                printPar(l - 1, r, count + 1, num);
            }
            if (r > l) {
                printPar(l, r - 1, count + 1, num);
            }
        }

    }


}
