package qiuzhao.guoqu.didi;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
        public static void main(String[] args) {
            Long start = System.currentTimeMillis();
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = input.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            int num = n;
            while (num-- > 0)
                list.add(input.nextInt());
            int min = 10000;
            int curNum = 0;
            int curIndex = 0;
            int length = list.size();
            PriorityQueue queue = new PriorityQueue();
            while (m-- > 0) {
                if(curIndex > list.size()/2)
                    length = curIndex;
                else length = list.size();
                min = 1000000;
                curNum = 0;
                curIndex = 0;

                while (length-- > 0) {
                    curNum = list.get(length);
                    if (curNum < min) {
                        if (queue.size() < 5)
                            queue.add(curIndex);
                        min = curNum;
                        curIndex = length;
                    }
                }

                if (curIndex - 1 < 0) {
                    list.set(curIndex + 1, list.get(curIndex + 1) + list.get(curIndex));
                    list.remove(curIndex);
                } else if (curIndex + 1 >= list.size() || list.get(curIndex - 1) <= list.get(curIndex + 1)) {
                    list.set(curIndex - 1, list.get(curIndex - 1) + list.get(curIndex));
                    list.remove(curIndex);
                } else {
                    list.set(curIndex + 1, list.get(curIndex + 1) + list.get(curIndex));
                    list.remove(curIndex);
                }
    //            System.out.println(list);
            }
    //        System.out.println(list);
            length = list.size();
            min = 1000000;
            curNum = 0;
            while (length-- > 0) {
                curNum = list.get(length);
                if (curNum < min) {
                    min = curNum;
                }
            }
            System.out.println(min);
            System.out.println(System.currentTimeMillis() - start);
        }

}
