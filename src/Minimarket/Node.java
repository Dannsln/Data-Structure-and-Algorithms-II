package Minimarket;

public class Node {

    Customer data;
    Node linkRigth;
    Node linkLeft;

    public Node(){

    }

    public Node(Customer data){
        this.data = data;
    }

    public Node(Customer data, Node linkRigth, Node linkLeft){
        this.data = data;
        this.linkRigth = linkRigth;
        this.linkLeft = linkLeft;
    }

}
