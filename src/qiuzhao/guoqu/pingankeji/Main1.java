package qiuzhao.guoqu.pingankeji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {

    static class Node {
        private String name;
        private double score;

        public Node(String g, double f) {
            name = g;
            score = f;
        }

        public void Setname(String s) {
            name = s;
        }

        public void SetScore(int f) {
            score = f;
        }

        public String Getname() {
            return name;
        }

        public double GetScore() {
            return score;
        }
    }

    static class Comparators implements Comparator<Node> {
        @Override
        public int compare(Node arg0, Node arg1) {
            double val1 = arg0.GetScore();
            double val2 = arg1.GetScore();
            if (val1 > val2) return -1;
            else return 1;
        }
    }

    static ArrayList<Node> AL = new ArrayList<Node>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        String name = "";
        String string = "";
        int index = 0;
        int len = 0;
        while (s.hasNextLine()) {
            string = s.nextLine();
            String[] arr = string.split(" ");
            len = arr.length - 1;
            while (len > 0) {
                num++;
                sum = sum + Integer.valueOf(arr[len--]);
            }
            Node node = new Node(arr[0], sum / (double)num);
            index = Collections.binarySearch(AL, node, new Comparators());
            AL.add(-(index + 1), node);
        }
        num = 0;
        while (num < AL.size()) {
            System.out.println(AL.get(num).Getname() + " " + (int)AL.get(num).GetScore());
            num++;
        }
    }
}
