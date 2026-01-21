// Binary Search Tree implementation with Sorted Array :

import java.util.*;
class BST{
    
    class Node{
    private Node right;
    private Node left;
    private int height;
    private int value;
    
    public Node(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    }
    private Node root;
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        else if(value > node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void populate(int[] arr){
        for(int i = 0;i<arr.length;i++){
            this.insert(arr[i]);
        }
    }
    public void populateSorted(int[] arr){
        populateSorted(arr,0,arr.length);
    }
    private void populateSorted(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(arr[mid]);
        populateSorted(arr,start,mid);
        populateSorted(arr,mid+1,end);
    }
    public void display(){
        display(root,"Root Node :");
    }
    private void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"left child of "+node.value+": ");
        display(node.right,"right child of "+node.value+": ");

    }
    
    public BST(){
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    BST tree = new BST();
	    int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
	    tree.populateSorted(arr);
	    tree.display();
	}
}
