package Generictree;

import java.util.ArrayList;
import java.util.Stack;

public class GTree {
    static  class Node{
        int data;
        ArrayList<Node> children;
        Node (int data){
            this.data=data;
            this.children=new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        int[] data={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root=construct(data);
        display(root);

    }
    public static Node construct(int[] data){
        Stack<Node> stack=new Stack<>();
        Node root=null;
        for (int i = 0; i < data.length; i++) {
           if(data[i]==-1){
               stack.pop();
           }
           else {
               Node new_node =new Node(data[i]);
               if(stack.size()>0){
                   Node parent=stack.peek();
                   parent.children.add(new_node);
               }
               else{
                   root=new_node;
               }
               stack.push(new_node);
            }
        }
        return root;
    }
    public static void display(Node node){
        System.out.print(node.data+" -> ");
        for (int i = 0; i < node.children.size(); i++) {
            Node curr_child =node.children.get(i);
            System.out.print(curr_child.data+" ");
        }
        System.out.println(".");
        for (int i = 0; i < node.children.size(); i++) {
            Node curr_child=node.children.get(i);
            display(curr_child);
        }
    }
}
