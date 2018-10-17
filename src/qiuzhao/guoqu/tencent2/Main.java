package qiuzhao.guoqu.tencent2;

import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int a = input.nextInt();
        int x = input.nextInt();
        int b = input.nextInt();
        int y = input.nextInt();
        recursion(k, a, x, b, y,x,y);
        System.out.println(count);
    }

    public static void recursion(int k, int a, int x, int b, int y,int xx,int yy) {
        if (k == 0 && x > 0 && y > 0)
            count =(xx-x);//cjiji * cjiji
        if (k < 0 || x<= 0 ||y <=0)
            return;
        if (x > 0 && y > 0) {
            recursion(k - a, a, x - 1, b, y,xx,yy);
            recursion(k - b, a, x, b, y - 1,xx,yy);
        }

    }
}
