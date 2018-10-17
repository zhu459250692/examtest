package qiuzhao.guoqu.xunlei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 10;
        int res = 1;
        num = in.nextInt();

        for (int i = 1; i*i <= num; i++) {
            for (int j = i; j*j <= num; j++) {
                if(i*i + j*j > num*num) break;
                int k = (int)Math.sqrt(i*i+j*j);
                if(k*k == i*i+j*j)
                    if(Math.pow(k/2,2)!=Math.pow(i/2,2) + Math.pow(j/2,2))
                        if(Math.pow(k/3,2)!=Math.pow(i/3,2) + Math.pow(j/3,2))
                            if(Math.pow(k/5,2)!=Math.pow(i/5,2) + Math.pow(j/5,2))
                                if(Math.pow(k/7,2)!=Math.pow(i/7,2) + Math.pow(j/7,2))
                                    res++;
            }
        }

        System.out.println(res);
    }


}
