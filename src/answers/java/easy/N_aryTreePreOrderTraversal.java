package answers.java.easy;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreOrderTraversal {
    List<Integer> preOrderList = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null)
            return preOrderList;
        preOrderList.add(root.val);
        for (Node r : root.children) {
            preorder(r);
        }
        return preOrderList;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}