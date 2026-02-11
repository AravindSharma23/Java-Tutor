//Level order successor of a node - Google ques 
// Here just finding right next of key - 14 
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Main {

    public static void main(String[] args) {


        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(14);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(11);
        root.left.right.left = new TreeNode(36);
        root.left.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(2);
        root.right.right.left.right = new TreeNode(44);

        Main obj = new Main();
         TreeNode ans = obj.findSuccessor(root);
        System.out.println(ans.val);
    }

    public TreeNode findSuccessor(TreeNode root){
        int key = 14;
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
               TreeNode currentNode = queue.poll();
                int currentValue = currentNode.val;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
                if(currentValue == key){
                    break;
                }
            
        }
        return queue.peek();
    }
}
