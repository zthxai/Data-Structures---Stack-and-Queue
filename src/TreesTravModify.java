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
        Queue<NodeWithLevel<?>> nodequeue = new LinkedList<>();
        if (n != null) {
            nodequeue.add(new NodeWithLevel<>(n, 1));
            int currentLevel = 0;
            while (!nodequeue.isEmpty()) {
                NodeWithLevel<?> next = nodequeue.remove();
                if (next.level != currentLevel) {
                    System.out.print("\nLevel " + next.level + ": ");
                    currentLevel = next.level;
                }
                System.out.print(next.node.data + " ");
                if (next.node.getLeft() != null) {
                    nodequeue.add(new NodeWithLevel<>(next.node.getLeft(), next.level + 1));
                }
                if (next.node.getRight() != null) {
                    nodequeue.add(new NodeWithLevel<>(next.node.getRight(), next.level + 1));
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
        System.out.println("Level Order:");
        levelorder(one);
        System.out.println();
    }

    public static class NodeWithLevel<T> {
        public Node<T> node;
        public int level;

        public NodeWithLevel(Node<T> node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}