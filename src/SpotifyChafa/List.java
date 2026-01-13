package SpotifyChafa;

import java.util.Scanner;

public class List {



    Scanner sc = new Scanner(System.in);

    Node first; Node last;   Node current;

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

        current = first;

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

        if (current==null) {
            System.out.println("Lista vacia");
            return;
        }

        System.out.println("---------Reproduciendo canción---------");

        Node played = current;

        Node next;
        Node previous;
        boolean previousSong = current.linkLeft == last; //true
        boolean nextSong = current.linkRigth== first; // true
       

        

            if (previousSong) {

            System.out.println(current.data.name+" | "+current.data.artist+" | "+current.data.duration);

            //Siguiente canción
            next = current.linkRigth;
            System.out.println("Canción en cola : "+next.data.name+" | "+next.data.artist);
            current = current.linkRigth;

        } else if(nextSong){

            System.out.println(current.data.name+" | "+current.data.artist+" | "+current.data.duration);
            //Canción Posterior:
            previous = current.linkLeft;
            System.out.println("Canción Anterior: " +previous.data.name +" | " +previous.data.artist);

        
            
        }  else if((!previousSong&&!nextSong)){
            System.out.println(current.data.name+current.data.artist+current.data.duration);

                //Siguiente canción:
                next = current.linkRigth; 
                System.out.println("Canción en cola: "+ next.data.name +" " + next.data.artist );

                //Canción Posterior:
                previous = current.linkLeft;
                System.out.println("Canción Anterior: " +previous.data.name +" | " +previous.data.artist);

                current = current.linkRigth;
        }
        
    
        
     
            
       

        if (played == last) {
            System.out.println("Playlist terminada");
            current=null;
        }

        if (first.linkLeft==first&&last.linkRigth==last) {
            System.out.println("Ya no hay canciones en cola");
            
        }
    
            /*if (previousSong) {
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
        */
            //Canción Posterior:
            /* 
            previous = first.linkLeft;
            if (first.linkLeft==last) {
                System.out.println("No hay canciones previas en la cola");
            } else{
                System.out.println("Canción Posterior: " +previous.data.name +" | " +previous.data.artist);
            }
            */
    }


    public void playPreviousSong(){

         System.out.println("---------Reproduciendo canción---------");
       

        Node next;
        Node previous;
        boolean previousSong = current.linkLeft == last; //true
        boolean nextSong = current.linkRigth== first; // true

        if (previousSong) {
            System.out.println("No hay canciones previas");
            
        }

       if (nextSong) {
        
        current=current.linkLeft;
        System.out.println(current.data.name+current.data.artist);
        next = current.linkRigth; previous = current.linkLeft;
        //Cancion Anterior
        System.out.println("Anterior : "+previous.data.name+" | "+previous.data.artist);
        
        //Cancion en cola
        System.out.println("Canción en cola : "+next.data.name+" | "+next.data.artist);
       } else if(!previousSong&&!nextSong){
        current=current.linkLeft;
        System.out.println(current.data.name+current.data.artist);
        next = current.linkRigth; previous = current.linkLeft;
        //Cancion Anterior
        System.out.println("Canción Anterior : "+previous.data.name+" | "+previous.data.artist);
        
        //Cancion en cola
        System.out.println("Canción en cola : "+next.data.name+" | "+next.data.artist);

       }
        


    }
}
