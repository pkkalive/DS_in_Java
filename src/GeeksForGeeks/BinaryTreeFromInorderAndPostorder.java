package GeeksForGeeks;

import GeeksForGeeks.Trees.Node;

import java.util.HashMap;

public class BinaryTreeFromInorderAndPostorder {
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
    private static Node buildTree(int[] postorder, int[] inorder){
        getMap(inorder);
        return constructTree(postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    private static Node constructTree(int[] postorder, int str_in, int end_in, int end_po){
        if (str_in > end_in) {
            return null;
        }
        Node root = new Node(postorder[end_po]);
        int idx = getIndex(postorder[end_po]);

        int cnt_R = end_in - idx;
        root.left = constructTree(postorder, str_in, idx - 1, end_po - cnt_R - 1);
        root.right = constructTree(postorder, idx + 1, end_in, end_po - 1);
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
        int[] A = new int[]{6, 3, 2, 1};
        int[] B = new int[]{6, 1, 3, 2};

        Node root = buildTree(A, B);
        print(root, 0);
    }
}
