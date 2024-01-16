import java.util.LinkedList;
import java.util.Queue;

public class TreesTravModify<T> {

    public static class Node<T> {
        public Node<T> left;
        public Node<T> right;
        public T data;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return this.left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return this.right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }

    public static void preorder(Node<?> n) {
        if (n != null) {
            System.out.print(n.data + " ");
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }

    public static void inorder(Node<?> n) {
        if (n != null) {
            inorder(n.getLeft());
            System.out.print(n.data + " ");
            inorder(n.getRight());
        }
    }

    public static void postorder(Node<?> n) {
        if (n != null) {
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.print(n.data + " ");
        }
    }

    public static void levelorder(Node<?> n) {
        Queue<Node<?>> nodequeue = new LinkedList<>();
        if (n != null) {
            nodequeue.add(n);
            while (!nodequeue.isEmpty()) {
                Node<?> next = nodequeue.remove();
                System.out.print(next.data + " ");
                if (next.getLeft() != null) {
                    nodequeue.add(next.getLeft());
                }
                if (next.getRight() != null) {
                    nodequeue.add(next.getRight());
                }
            }
        }
    }

    public static void main(String[] args) {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);

        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        four.setLeft(seven);
        six.setLeft(eight);
        six.setRight(nine);

        System.out.print("Preorder: ");
        preorder(one);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(one);
        System.out.println();
        System.out.print("Post Order: ");
        postorder(one);
        System.out.println();
        System.out.print("Level Order: ");
        levelorder(one);
        System.out.println();
    }
}