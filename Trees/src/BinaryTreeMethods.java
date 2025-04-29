import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMethods {
    BinaryTreeNode root;

    public BinaryTreeMethods()
    {
        root = null;
    }


    void inOrderTraversal(BinaryTreeNode root)
    {
        if(root != null)
        {
            inOrderTraversal(root.left);
            System.out.print(root.data+" ---> ");
            inOrderTraversal(root.right);
        }
    }

    void preOrderTraversal(BinaryTreeNode root)
    {
        if(root!=null)
        {
            System.out.print(root.data + " --> ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }


    void postOrderTraversal(BinaryTreeNode root)
    {
        if(root != null)
        {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" --> ");
        }
    }


    void insertBinaryNodes(int data){
        BinaryTreeNode newNode = new BinaryTreeNode(data);

        if(root == null)
        {
            root = newNode;
            return;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty())
        {
            BinaryTreeNode curr = queue.poll();

            if(curr.left == null)
            {
                curr.left = newNode;
                break;
            }else{
                queue.offer(curr.left);
            }


            if(curr.right == null)
            {
                curr.right = newNode;
                break;
            }else{
                queue.offer(curr.right);
            }
        }


    }

    public static void main(String[] args)
    {
        BinaryTreeMethods bt = new BinaryTreeMethods();

        bt.insertBinaryNodes(1);
        bt.insertBinaryNodes(2);
        bt.insertBinaryNodes(3);
        bt.insertBinaryNodes(4);
        bt.insertBinaryNodes(5);
        bt.insertBinaryNodes(6);
        bt.insertBinaryNodes(7);

        System.out.println("Inorder Traversal...");
        bt.inOrderTraversal(bt.root);
        System.out.println();
        System.out.println("Preorder Traversal...");
        bt.preOrderTraversal(bt.root);
        System.out.println();
        System.out.println("Postorder Traversal...");
        bt.postOrderTraversal(bt.root);
    }
}
