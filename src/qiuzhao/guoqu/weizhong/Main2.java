package qiuzhao.guoqu.weizhong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        int n6 = input.nextInt();
        int result = n6;
        int rest = 0;
        if (n5 != 0) {
            result = result + n5;
            if (n1 > 11)
                n1 = n1 - 11;
            else
                n1 = 0;
        }
        if (n4 != 0) {
            result = result + n4;
            if (n2 > n4) {//·ÅÂú
                n2 = n2 - n4;
                rest = n4 * 16 - n2 * 4;
                if (n1 > rest) {
                    n1 = n1 - rest;
                } else
                    n1 = 0;
            } else {//n2·Å²»Âú
                n2 = 0;
                rest = n4 * 16 - n2 * 4;
                if (n1 > rest) {
                    n1 = n1 - rest;
                } else
                    n1 = 0;
            }
        }
        if (n3 != 0) {
            result = result + n3 / 4;
            n3 = n3 / 4;
            if (n3 == 1) {
                n2 = n2 - 5;
                rest = 36 - 9 - 5 * 4;
            }
            if (n3 == 2) {
                n2 = n2 - 3;
                rest = 36 - 2 * 9 - 3 * 4;
            }
            if (n3 == 3) {
                n2 = n2 - 1;
                rest = 5;
            }
            if (n1 > rest)
                n1 = n1 - rest;
            else n1 = 0;
        }
        if (n2 != 0) {
            result = result + n2 / 9;
            n2 = n2 - n2 / 9;
            rest = 36 - n2 * 4;
            if (n1 > rest) {
                n1 = n1 - rest;
                result = result + (int)Math.ceil(n1 / 36.0) + 1;
            } else
                n1 = 0;
        }
        System.out.println(result);
    }
}
