public class BST_Search_Delete{
    Node search(Node root,int key){
        if(root==null || root.data==key) return root;
        if(key<root.data) return search(root.left);
        return search(root.right);
    }
    Node minValue(Node root){
        while(root.left!=null) root=root.left;
        return root;
    }
    Node deleteNode(Node root,int key){
        if(root==null) return root;
        if(key<root.data) root.left=deleteNode(root.left,key);
        else if(key>root.data) root.right=deleteNode(root.right,key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            Node temp=minValue(root.right);
            root.data=temp.data;
            root.right=deleteNode(root.right,temp.data);
        }
        return root;
    }
}