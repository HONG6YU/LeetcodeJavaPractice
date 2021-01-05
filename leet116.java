package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leet116 {
    Queue<Node> queue = new LinkedList<>();

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                if (i == size - 1) {
                    cur.next = null;
                } else {
                    Node next = queue.peek();
                    cur.next = next;
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
        }
        return root;
    }
}
