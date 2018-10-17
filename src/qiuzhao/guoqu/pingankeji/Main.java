package qiuzhao.guoqu.pingankeji;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static class TreeNode {
        TreeNode left = null;
        TreeNode right = null;
        int value;

        public TreeNode(int v) {
            this.value = v;
        }
    }

    public int Height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 0, right = 0;
        if (root.left != null) {
            left = Height(root.left);
        }
        if (root.right != null) {
            right = Height(root.right);
        }
        return ((left >= right) ? left : right) + 1;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        int num = 10;
        int rootval = s.nextInt();
        int rootfirst = s.nextInt();

        TreeNode root = new TreeNode(rootval);
        TreeNode rootLeft = new TreeNode(rootfirst);
        root.left = rootLeft;

        HashMap<Integer, TreeNode> nodeMap = new HashMap<Integer, TreeNode>();
        nodeMap.put(rootval, root);
        nodeMap.put(rootfirst, rootLeft);

        for (int i = 0; s.hasNext(); i++) {
            int father = s.nextInt();
            int children = s.nextInt();
            TreeNode parent = nodeMap.get(father);
            TreeNode child = new TreeNode(children);
            if (parent != null) {
                if (parent.left == null) {
                    parent.left = child;
                } else if (parent.right == null) {
                    parent.right = child;
                }
            } else {
                parent = new TreeNode(father);
                parent.left = child;
            }
            nodeMap.put(father, parent);
            nodeMap.put(children, child);
        }
        System.out.println(m.Height(root));
        s.close();
    }
}

