package qiuzhao.guoqu.didi;

import java.util.Scanner;

public class Mainwangshang {
    public static boolean func(long mid, int[] v, int n, int m) {
        int ans = 0, i, tmp = 0;
        for (i = 0; i < n; i++) {
            if ((tmp + v[i]) >= mid) {
                ans++;
                tmp = v[i];
            } else
                tmp += v[i];
        }
        if (ans == 0)
            ans = 1;
        if (ans >= (n - m))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0, l = Long.MAX_VALUE, r, mid;
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
            sum += v[i];
            l = Math.min(l, v[i]);
        }
        r = sum / (n - m);
        while (l <= r) {
            mid = (l + r) / 2;
            if (func(mid, v, n, m))
                l = mid + 1;
            else
                r = mid - 1;
        }
        System.out.println(r);
    }
}
