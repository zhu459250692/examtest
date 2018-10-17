package qiuzhao.guoqu.xiaomi;

import java.util.*;

public class Main {
    private static String numStr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        HashMap<Integer, Integer> allNumber = new HashMap<Integer, Integer>();
        LinkedHashMap<String, Integer> stringAndshijinzhi = new LinkedHashMap<>();
        while (!s.equals("END")) {
            String[] n = s.split("#");
            Integer jinzhi = Integer.valueOf(n[0]);
            int shijinzhi = Integer.valueOf(n[1], jinzhi);
            stringAndshijinzhi.put(s, shijinzhi);
            if (!allNumber.containsKey(shijinzhi)) {
                allNumber.put(shijinzhi, 0);
            } else
                allNumber.replace(shijinzhi, 1);
            s = input.nextLine();
        }

        int length = allNumber.size();
        for (String ans : stringAndshijinzhi.keySet()) {
            int shijinzhi = stringAndshijinzhi.get(ans);
            if(allNumber.get(shijinzhi) == 0)
                System.out.println(ans);
            else
                length--;
        }
        if (length == 0)
            System.out.println("None");

    }

    public static long N_to_10(String number, int N) {
        char ch[] = number.toCharArray();
        int len = ch.length;
        long result = 0;
        if (N == 10) {
            return Long.parseLong(number);
        }
        long base = 1;
        for (int i = len - 1; i >= 0; i--) {
            int index = numStr.indexOf(ch[i]);
            result += index * base;
            base *= N;
        }

        return result;
    }

}
