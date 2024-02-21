package GeeksForGeeks.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private static ArrayList<Integer> levelOrder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.remove();
            list.add(current.data);
            if (current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
        return list;
    }

    private static ArrayList<Integer> levelOrder1(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            list.add(current.data);
            if (current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
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

        ArrayList<Integer> list = levelOrder(root);
        ArrayList<Integer> list1 = levelOrder1(root);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
    }
}
