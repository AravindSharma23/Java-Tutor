//103. Binary Tree Zigzag Level Order Traversal - medium - leetcode - imp

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reversed = false;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i = 0;i<levelSize;i++){
                if(!reversed){
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                }else{
            // reverse = true means remove from last of queue and add at first of queue     
                 TreeNode currentNode = queue.pollLast();
                 currentLevel.add(currentNode.val);
                 // here reverse is true so 1st check for right and then left
                 if(currentNode.right != null){
                        queue.addFirst(currentNode.right);
                    }
                  if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
                }
                
            }
            reversed = !reversed; 
            result.add(currentLevel);
        }
        return result;
    }
}
