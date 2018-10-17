package datastructure.kmp;
/*
模式串和子串匹配问题，穷举法
 */
public class FindSubStringLocation {
    public static void main(String[] args) {
        float a = 1234567890123456789l;
        System.out.println(a);
        float b = 1.234567890123456789f;
        float c = Float.valueOf("123456789012345678901234567890123456789");//39个数
        System.out.println(b);
        System.out.println(c);
        float d = 1000000000000000000000000000000f;
        System.out.println(d);
        index("sdfsdfgsd".toCharArray(), "gsd".toCharArray());
    }

   static int index(char s[], char[] t) {
        //S为主串，T为模式，串的第0位置存放串长度；串采用顺序存储结构
        int i = 0;
        int j = 1;                           // 从第一个位置开始比较
        while (i <= s[0] && j <= t[0]) {
            if (s[i] == t[j]) {             // 继续比较后继字符
                ++i;
                ++j;
            } else {                        // 指针后退重新开始匹配
                i = i - j + 2;
                j = 1;
            }
        }
        if (j > t[0]) return i - t[0];    // 返回与模式第一字符相等的字符在主串中的序号
        else return 0;                     // 匹配不成功
    }

}
