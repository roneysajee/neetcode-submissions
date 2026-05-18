/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Map<Node, Node> map = new HashMap<>();

        return recursion(head, map);
    }

    private Node recursion(Node cNode, Map<Node, Node> map) {
        if (cNode == null)
            return null;
        if (map.containsKey(cNode)) {
            return map.get(cNode);
        }
        Node node = new Node(cNode.val);
        map.put(cNode, node);
        node.next = recursion(cNode.next, map);
        node.random = node;
        node.random = recursion(cNode.random, map);
        return node;
    }
}
