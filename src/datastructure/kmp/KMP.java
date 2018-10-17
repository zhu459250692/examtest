package datastructure.kmp;

/*
模式串和子串匹配问题
 */
public class KMP {

    public int[] buildNext(char[] s, int[] next) {
        int i = -1;
        int j = 0;
        int length = next.length;
        while (j < length) {
            if (i == -1 || s[i] == s[j]) {
                i++;
                j++;
                next[j] = i;
            } else i = next[i];//这个可以考虑成：主串和子串都是模式串的一部分，所以运用了下面方法的逻辑
        }
        return next;
    }

    public int findSubStringLocation(char[] sub, char[] s, int[] next) {
        int length1 = s.length;
        int length2 = sub.length;
        int i = 0;
        int j = 0;
        while (i < length1 && j < length2) {
            if (next[j] == -1 || s[i] == sub[j]) {
                i++;
                j++;
            } else j = next[j];
        }
        if (i > length1)
            return i - length1;
        else return -1;
    }
}

class Main {
    public static void main(String[] args) {
        KMP kmp = new KMP();
        char[] s = "sdfsdfgsd".toCharArray();
        char[] sub = "gsd".toCharArray();
        int[] next = new int[sub.length];
        kmp.buildNext(sub, next);
        kmp.findSubStringLocation(s, sub, next);
    }
}
