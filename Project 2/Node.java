public class Node {
    public String data;                   // data stored in this node
    public Node nextDot;   // left subtree
    public Node nextDash;  //  right subtree

    // post: constructs a leaf node with given data
    public Node(String data) {
        this(data, null, null);
    }

    // post: constructs a node with the given data and links
    public Node(String data, Node left,
                          Node right) {
        this.data = data;
        this.nextDot = left;
        this.nextDash = right;
    }
}