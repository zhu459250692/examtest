package qiuzhao.guoqu.tencentqiuzhao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
class sdfsdf{
int i = 1;
//@Override
//public int hashCode(){
//    return 5;
//}
}
public class Main2 {
    public static void main(String[] args) {
        HashSet<sdfsdf> s=new HashSet<sdfsdf>();
        sdfsdf ss = new sdfsdf();
        s.add(ss);
        System.out.println(s.hashCode() + " " + ss.hashCode());
        System.out.println(4);
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i<x;i++)
            arr[i] = input.nextInt();
        int changetime = input.nextInt();
        System.out.println(getMaxSum(x,arr,changetime));
    }
    public static int getMaxSum(int N, int[] arr, int changeTime) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        Arrays.sort(arr);

        if (sum > 0) {
            for (int i = 0; i < changeTime; i++) {
                arr[i] = -arr[i];
            }
        } else {
            for (int i = arr.length - 1; i < changeTime; i--) {
                arr[i] = -arr[i];
            }
        }

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
