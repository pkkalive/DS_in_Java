package GeeksForGeeks.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
    static ArrayList<Integer> postorder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null || !stack.empty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            } else {
                Node temp = stack.peek().right;
                if (temp == null){
                    temp = stack.peek();
                    stack.pop();
                    list.add(temp.data);
                    while (!stack.empty() && temp == stack.peek().right){
                        temp = stack.peek();
                        stack.pop();
                        list.add(temp.data);
                    }
                } else {
                    current = temp;
                }
            }
        }
        return list;
    }

    static ArrayList<Integer> postorderTwoStack(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        Node current = root;
        while (!stack1.empty()) {
            current = stack1.pop();
            stack2.push(current);
            if (current.left != null){
                stack1.push(current.left);
            }
            if (current.right != null){
                stack1.push(current.right);
            }
        }
        while (!stack2.empty()){
            list.add(stack2.pop().data);
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

        ArrayList<Integer> list = postorder(root);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        ArrayList<Integer> list2 = postorderTwoStack(root);
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }
}
