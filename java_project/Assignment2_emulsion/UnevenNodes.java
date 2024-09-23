package java_project.Assignment2_emulsion;

import java.util.*;

public class UnevenNodes {
    public static int countUneven(Node root, int k) {
        if (root == null) {
            return 0; // Base case: empty tree
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int heightDiff = Math.abs(leftHeight - rightHeight);
        int unevenCount = (heightDiff >= k) ? 1 : 0;

        // Recursively check left and right subtrees
        unevenCount += countUneven(root.left, k);
        unevenCount += countUneven(root.right, k);

        return unevenCount;
    }

    public static int getHeight(Node node) {
        if (node == null) {
            return 0; // Base case: height of an empty subtree is 0
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static Node createTree(int[] a, int i) {
        if (i >= a.length || a[i] == -1) {
            return null;
        }
        Node newnode = new Node(a[i]);
        newnode.left = createTree(a, 2 * i + 1);
        newnode.right = createTree(a, 2 * i + 2);
        return newnode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Node root = createTree(a, 0);
        System.out.println(countUneven(root, k));
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
