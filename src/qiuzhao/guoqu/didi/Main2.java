package qiuzhao.guoqu.didi;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] targetArray = new int[4];
        while (i < 4)
            targetArray[i++] = input.nextInt();
        int[] originalArray = {1, 2, 3, 4};

        String result = canBeSort(targetArray, originalArray);
        System.out.println(result);
    }

    public static String canBeSort(int[] originalArray, int[] targetArray) {
        String canBeSort = "No";
        Stack<Integer> st = new Stack<Integer>();

        int i = 0, j = 0, len = originalArray.length;

        while (i <= len && j <= len) {
            if (i == len && j == len) {
                break;
            }
            if (st.empty() || st.peek() != targetArray[j]) {
                st.push(originalArray[i]);
                i++;
            } else {
                st.pop();
                j++;
            }
        }

        if (st.empty() && i == len && j == len) {
            canBeSort = "Yes";
        }

        return canBeSort;
    }
}
