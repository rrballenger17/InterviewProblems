
//19) Write code to print InOrder traversal of a tree?




public class Binarytree
{
    private static Node root;

    public Binarytree(int data)
    {
        root = new Node(data);
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static void printBST(){
        printBST(root);
    }

    // My implementation
    private static void printBST(Node curr){


        if(curr == null){
            return;
        }

        if(curr.getLeft() == null && curr.getRight() == null){
            System.out.println(curr.getKey());
            return;
        }

        printBST(curr.getLeft());

        System.out.println(curr.getKey());

        printBST(curr.getRight());
    }


    public static void main(String args[])
    {
        //Node n7 = new Node(7);
        Node n4 = new Node(4);
        Node n3 = new Node(3);
        Node n6 = new Node(6);
        Node n13 = new Node(13);
        Node n8 = new Node(8);
        Node n22 = new Node(22);


        Binarytree tree = new Binarytree(7); //  
        tree.add(root, n4, "left"); //         
        tree.add(n4, n3, "left"); //         
        tree.add(n4, n6, "right"); //         

        tree.add(root, n13, "right"); //         
        tree.add(n13, n8, "left"); //         
        tree.add(n13, n22, "right"); //   


        printBST();

    }
}

class Node {
    private int key;
    private Node left;
    private Node right;

    Node (int key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right ) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

}