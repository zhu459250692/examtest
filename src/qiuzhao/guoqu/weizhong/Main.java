package qiuzhao.guoqu.weizhong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.ceil(1.5));
        Scanner input = new Scanner(System.in);
        int n = 0;
        while(input.hasNext()){
            n = input.nextInt();



            if(n == 1){
                System.out.println("1/1");
                return;
            }

            int low = 0;
            int high = 0;
            int fenzi = 0;
            int fenmu = 0;
            for(int i = 2; i < 10000000; i++){
                low = (i*(i - 1)) / 2 + 1;
                high = ((1+i)*i) / 2;
                if(n <=high && n >= low){
                    if(i % 2 == 0){
                        for(int count = 0; low <= n; low++, count++){
                            if(low == n){
                                fenzi = 1 + count;
                                fenmu = i - count;
                                break;
                            }
                        }
                    }else if(i % 2 == 1){
                        for(int count = 0; low <= n; low++, count++){
                            if(low == n){
                                fenzi = i - count;
                                fenmu = 1 + count;
                                break;
                            }
                        }
                    }
                }
                if(low == n){
                    System.out.println(fenzi + "/" + fenmu);
                    break;
                }
            }



        }



    }
}
