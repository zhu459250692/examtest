package qiuzhao.guoqu.jingdongexam.main2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        res = in.nextInt();
        if(res < 4)
            System.out.println(res);

        int cc = res - 2;
        if((res - 2) % 2 == 1){
            res = (cc/2)* (cc/2);
        }

        System.out.println(res);
    }
}
