package SpotifyChafa;

public class Node {

    Song data;
    Node linkRigth;
    Node linkLeft;

    public Node(){

    }

    public Node(Song data){
        this.data = data;
    }

    public Node(Song data, Node linkLeft, Node linkRigth){
        this.data = data;
        this.linkLeft = linkLeft;
        this.linkRigth = linkRigth;
    }


}
