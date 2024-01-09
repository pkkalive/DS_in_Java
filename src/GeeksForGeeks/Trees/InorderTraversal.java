package GeeksForGeeks.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
    private static ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null ||!stack.empty()){
            if (current != null){
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.data);
                current = current.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList<Integer> list = inorder(root);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
