package GeeksForGeeks;

import GeeksForGeeks.Trees.Node;

import java.util.HashMap;

public class BinaryTreeFromInorderAndPreorder {
    private static final HashMap<Integer, Integer> indexMap = new HashMap<>();
    private static final int COUNT = 10;
    private static void getMap(int[] inorder){
        int idx = 0;
        for (int num: inorder){
            indexMap.put(num, idx);
            idx++;
        }
    }
    private static int getIndex(int val){
        return indexMap.get(val);
    }
    private static Node buildTree(int[] preorder, int[] inorder){
        getMap(inorder);
        return constructTree(preorder, 0, inorder.length - 1, 0, preorder.length);
    }

    private static Node constructTree(int[] preorder, int str_in, int end_in, int str_pre, int end_pre){
        if (str_pre > end_pre || str_in > end_in) {
            return null;
        }
        Node root = new Node(preorder[str_pre]);
        int index = getIndex(preorder[str_pre]);
        int cnt_R = str_pre + index - str_in;
        root.left = constructTree(preorder, str_in, index - 1, str_pre + 1, cnt_R);
        root.right = constructTree(preorder, index + 1, end_in, cnt_R + 1, end_pre);
        return root;
    }
    static void print(Node root, int space)
    {
        if (root == null) {
            return;
        }
        space += COUNT;
        print(root.right, space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(root.data + "\n");
        print(root.left, space);
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 6, 2, 3};
        int[] B = new int[]{6, 1, 3, 2};

        Node root = buildTree(A, B);
        print(root, 0);
    }
}
