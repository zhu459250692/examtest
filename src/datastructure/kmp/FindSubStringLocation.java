package datastructure.kmp;
/*
ģʽ�����Ӵ�ƥ�����⣬��ٷ�
 */
public class FindSubStringLocation {
    public static void main(String[] args) {
        float a = 1234567890123456789l;
        System.out.println(a);
        float b = 1.234567890123456789f;
        float c = Float.valueOf("123456789012345678901234567890123456789");//39����
        System.out.println(b);
        System.out.println(c);
        float d = 1000000000000000000000000000000f;
        System.out.println(d);
        index("sdfsdfgsd".toCharArray(), "gsd".toCharArray());
    }

   static int index(char s[], char[] t) {
        //SΪ������TΪģʽ�����ĵ�0λ�ô�Ŵ����ȣ�������˳��洢�ṹ
        int i = 0;
        int j = 1;                           // �ӵ�һ��λ�ÿ�ʼ�Ƚ�
        while (i <= s[0] && j <= t[0]) {
            if (s[i] == t[j]) {             // �����ȽϺ���ַ�
                ++i;
                ++j;
            } else {                        // ָ��������¿�ʼƥ��
                i = i - j + 2;
                j = 1;
            }
        }
        if (j > t[0]) return i - t[0];    // ������ģʽ��һ�ַ���ȵ��ַ��������е����
        else return 0;                     // ƥ�䲻�ɹ�
    }

}
