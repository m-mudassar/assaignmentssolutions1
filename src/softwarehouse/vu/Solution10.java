package softwarehouse.vu;

import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution10 {
    // Read numeric values from text file (at-least 500 values),
    // and load the data into binary tree
    // and then traverse it using in-order traversal

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        File file = new File("src/softwarehouse/vu/numbers.txt");

        try {
            FileReader fr = new FileReader(file);
            int content;
            while ((content = fr.read()) != -1) {
                char ch =(char) content;
                if (ch >= '0' && ch <= '9') {
                    tree.insert(Integer.parseInt(String.valueOf(ch)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        tree.inOrder(tree.root);
    }

    protected static class BinaryTree {
        public BinaryNode root;
        public BinaryTree(){
            this.root = null;
        }


        public void insert(int value) {
            BinaryNode node = new BinaryNode();
            node.setValue(value);
            if (root == null) {
                root = node;
                return;
            }
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.getLeft() == null) {
                    presentNode.setLeft(node);
                    break;
                }else if (presentNode.getRight() == null) {
                    presentNode.setRight(node);
                    break;
                } else {
                    queue.add(presentNode.getLeft());
                    queue.add(presentNode.getRight());
                }
            }
        }

        public void inOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            inOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrder(node.getRight());
        }

    }

    protected static class BinaryNode {
        private int value;
        private BinaryNode left;
        private BinaryNode right;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaryNode getLeft() {
            return left;
        }

        public void setLeft(BinaryNode left) {
            this.left = left;
        }

        public BinaryNode getRight() {
            return right;
        }

        public void setRight(BinaryNode right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return value + "";
        }

    }
}


