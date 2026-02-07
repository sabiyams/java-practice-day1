public class Treesprblm{
    //binary tree
    static class Node{
        int data;//the binary node containes data and list of nodes
        Node left,right;//we write binary tree into the left and right
        Node(int data){
            this.data=data;//the this keyword give the original value of data
            left=right=null;
        }
    }
    //create binary tree
    public static class  binarytree {
        Node root;
        binarytree(){
            root =null;//there are no nodes
        }
        public Node insert(Node root,int data){
            if(root==null){//the root is null so we assign the data into a root 
                root=new Node(data);//create root object 
                return root;
            }if(data<root.data){//we isert the left side 
                root.left=insert(root.left,data);
            }else if(data>root.data){//we insert the right side
                root.right=insert(root.right, data);
            }
            return root;
        }
       //traverse inorder-left,root,right
       public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
       }
       //preorder-root,left,right
       public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
       }
       //postorder-left,right,root
       public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
       }
       //search 
       public boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right, key);
        }
       }
       //height 
       public int hieght(Node root){
    if(root == null){
        return -1; // or return 0 if you prefer height of empty tree as 0
    }
    int leftHeight = hieght(root.left);
    int rightHeight = hieght(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
}
       //delete a node
       public Node delete(Node root,int key){
        if(root==null){
            return null;
        }
       if(key<root.data){
        root.left=delete(root.left, key);
       }else if(key>root.data){
        root.right=delete(root.right, key);
       }else{
        //node found
        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }
            //two children->inorder sucessor
            root.data=minValue(root.right);
            root.right=delete(root.right,root.data);
        }
        return root;
    }
    //min value
    public int minValue(Node root){
        int minv=root.data;
        while(root.left!=null){
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
       //main method
       public static void main(String[] args) {
        binarytree tree=new binarytree();
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,30);
        tree.root=tree.insert(tree.root,70);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,40);
        tree.root=tree.insert(tree.root,60);
        tree.root=tree.insert(tree.root,80);

        tree.postorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println("searcing for 60:");
        tree.search(tree.root, 60);
        System.out.println(tree.search(tree.root,60));
        System.out.println("hieght of tree:");
        System.out.println(tree.hieght(tree.root));

        //deleting nodes
        tree.root=tree.delete(tree.root, 20);
        System.out.println("after deleting 20:");
        tree.inorder(tree.root);

       }
    }
}