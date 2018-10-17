package qiuzhao.guoqu.baidu;




public class Main {


    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        String exprsn = "a-(b-(c+d-(m+n))+e)+f";
        char[] s = exprsn.toCharArray();
        int length = s.length;

        for(int i = 0; i < length; i++){
            if(s[i] == '('){
                Simlify(s, i, length);
                for(int n = length - 1; n >= 0 ; n--){
                    if(s[n] == ','){
                        i = n;
                        break;
                    }
                }
            }
        }

        char[] ans = new char[1000000];
        int m = 0;
        for(int i = 0; i < length; i++){
            if(s[i] != ','){
                ans[m++] = s[i];
            }
        }
        String ss = new String(ans);
        System.out.println(ss);
    }
    static char[] Simlify(char[] s, int i, int length){
        s[i]=',';
        if(i == 0 || s[i-1] == '+'){
            for(int j = i + 1; j < length; j++){
                if(s[j] == ')'){
                    s[j] = ',';
                    break;
                }
                if(s[j] == '('){
                    Simlify(s, j, length);
                    for(int n = length - 1; n >= 0 ; n--){
                        if(s[n] == ','){
                            j = n;
                            break;
                        }
                    }
                }
            }
        }else if(s[i-1] == '-'){
            for(int j = i + 1; j < length; j++){
                if(s[j] == ')'){
                    s[j] = ',';
                    break;
                }
                if(s[j] == '+'){
                    s[j] = '-';
                }else if(s[j] == '-'){
                    s[j] = '+';
                }
                if(s[j] == '('){
                    Simlify(s, j, length);
                    for(int n = length - 1; n >= 0 ; n--){
                        if(s[n] == ','){
                            j = n;
                            break;
                        }
                    }
                }
            }
        }
        else{

        }
        return s;
    }
}
