public class BST_Insert{
    Node insert(Node root,int x){
        if(root==null) return new Node(x);
        if(x<root.data) root.left=insert(root.left,x);
        else root.right=insert(root.right,x);
        return root;
    }
}