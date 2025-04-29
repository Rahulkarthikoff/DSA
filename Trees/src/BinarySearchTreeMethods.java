public class BinarySearchTreeMethods {
    BinarySearchTreeNode root;

    BinarySearchTreeMethods()
    {
       root = null;
    }


    void inorderTraversal(BinarySearchTreeNode root)
    {
        if(root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " --> ");
            inorderTraversal(root.right);
        }
    }


    void insertNode(int data)
    {
        BinarySearchTreeNode newNode = new BinarySearchTreeNode(data);

        if(root == null)
        {
            root = newNode;
            return;
        }else{
            BinarySearchTreeNode curr = root;
            while(true)
            {
                if(data <= curr.data)
                {
                    if(curr.left == null)
                    {
                        curr.left = newNode;
                        break;
                    }else{
                        curr = curr.left;
                    }
                }else{
                    if(curr.right == null)
                    {
                        curr.right = newNode;
                        break;
                    }else{
                        curr = curr.right;
                    }
                }
            }
        }

    }


    public static void main(String[] args)
    {
        BinarySearchTreeMethods bst = new BinarySearchTreeMethods();

        bst.insertNode(10);
        bst.insertNode(20);
        bst.insertNode(30);
        bst.insertNode(40);
        bst.insertNode(50);
        bst.insertNode(160);
        bst.insertNode(70);


        bst.inorderTraversal(bst.root);
    }
}
