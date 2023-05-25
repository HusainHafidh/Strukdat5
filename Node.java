/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasM5;

/**
 *
 * @author USER
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data=data;
    }
    
    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
            }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }
}
