package Shikai;

public class Node {

    Patient data;
    Node linkRigth;
    Node linkLeft;

    public Node(){

    }

    public Node(Patient data){
        this.data = data;
    }

    public Node(Patient data, Node linkRigth){
        this.data = data;
        this.linkRigth = linkRigth;
    }

    public Node(Patient data, Node linkRigth, Node linkLeft){
        this.data = data;
        this.linkRigth = linkRigth;
        this.linkLeft = linkLeft;
    }
}
