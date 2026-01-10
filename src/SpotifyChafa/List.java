package SpotifyChafa;

import java.util.Scanner;

public class List {



    Scanner sc = new Scanner(System.in);

    Node first; Node last;

    public boolean isEmpty(){
        return first == null;
    }

    public Song[] settleList(){


        Song[] data = new Song[5];
        data[0] = new Song("Báilame", 3.2, "Danny Ocean");
        data[1] = new Song("El secreto escondido en tu luz", 2.9, "Jaze");
        data[2] = new Song("Lunares", 2.4, "Jaze");
        data[3] = new Song("La terminal", 3.4, "Jaze");
        data[4] = new Song("Un mensaje de voz", 2.8, "Jaze");

        for(Song p : data){
            Node arise = new Node(p);
            if (isEmpty()) {
                first = arise; last = arise;
                arise.linkLeft = arise; arise.linkRigth = arise; 
            } else{
                last.linkRigth = arise; first.linkLeft = arise;
                arise.linkLeft = last; arise.linkRigth = first;
                last = arise;
            }
        }
        return data;
    }

    public void viewLinkedList(){
        Node n = first;
           System.out.println("----------Canciones----------");
        do {
            System.out.println();
            System.out.println("Nombre: "+n.data.name);
            System.out.println("Artista: "+n.data.artist);
            System.out.println("Duración(min): "+n.data.duration);

            n = n.linkRigth;
            
        } while (n!=first);
    }

    public void playSong(){


        System.out.println("---------Reproduciendo canción---------");

        Node next;
        Node previous;
        Node n = first;
        boolean previousSong = first.linkLeft == last; //true

            if (previousSong) {
                System.out.println(first.data.name+first.data.artist+first.data.duration);

                //Siguiente canción:
                next = first.linkRigth; 
                System.out.println("Canción en cola: "+ next.data.name +" " + next.data.artist );
            } else {


                System.out.println(first.data.name+first.data.artist+first.data.duration);

                //Siguiente canción:
                next = first.linkRigth; 
                System.out.println("Canción en cola: "+ next.data.name +" " + next.data.artist );

                //Canción Posterior:
                previous = first.linkLeft;
                if (first.linkLeft==last) {
                    System.out.println("No hay canciones previas en la cola");
                } else{
                    System.out.println("Canción Anterior: " +previous.data.name +" | " +previous.data.artist);
                }
            }
        

            
            //Canción Posterior:
            /* 
            previous = first.linkLeft;
            if (first.linkLeft==last) {
                System.out.println("No hay canciones previas en la cola");
            } else{
                System.out.println("Canción Posterior: " +previous.data.name +" | " +previous.data.artist);
            }
            */
            first = first.linkRigth; //Asociar enlaces

            
        do {
            n = n.linkRigth;
            
        } while (n!=first);    

    }


    public void playPreviousSong(){

        Node next;
        Node previous;
        Node n = first;
        boolean previousSong = first.linkLeft == last; //true

        //Siguiente canción:
        next = first.linkRigth;
        //Canción Posterior:
        previous = first.linkLeft;
       
       
        
        if (!previousSong) {
             System.out.println("---------Reproduciendo canción---------");
        System.out.println(previous.data.name+previous.data.artist+previous.data.duration);

        first = previous;
            
        } else{
            System.out.println("No hay ninguna canción anterior a la que estás reproduciendo en tu playlist");

        }

        do {
            n = n.linkRigth;
            
        } while (n!=first); 
    }
}
