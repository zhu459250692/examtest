package qiuzhao.guoqu.djiang;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        n = n >> 1;
        long m = input.nextInt();
        System.out.println(n*m);

    }
}
