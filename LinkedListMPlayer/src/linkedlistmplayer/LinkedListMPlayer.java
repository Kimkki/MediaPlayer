package linkedlistmplayer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMPlayer {

    private static final ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        //album name and the name of the artist
        Album album = new Album("The Colour Of My Love", "Celine");
        //names of the songs in the album
        album.addSong("The power of love", 5.43);
        album.addSong("Misled", 3.31);
        album.addSong("Think Twice", 4.48);
        album.addSong("Only one road", 4.49);
        album.addSong("Everybody talkin", 4.02);
        album.addSong("Next Plane out", 4.59);
        album.addSong("Love doesn't ask why", 4.08);
        album.addSong("When I fall in love", 4.20);

        albums.add(album); //adding to arraylist 

        //anther album and songs will be added 
        album = new Album("The Women in me", "Shania");
        album.addSong("What made you say that", 2.59);
        album.addSong("You Lay a Whole Lot of Love on Me", 2.48);
        album.addSong("Dance With the One That Brought You", 2.24);
        album.addSong("Still Under the Weather", 3.07);
        album.addSong("God Ain't Gonna Getcha for That", 2.45);
        album.addSong("Got a Hold on Me", 2.14);
        album.addSong("There Goes the Neighborhood", 3.17);
        album.addSong("Forget Me", 3.21);
        album.addSong("When he leaves you", 4.21);
        album.addSong("Crime of the Century", 3.29);
        albums.add(album);

        //greate a playlist using linkedList
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Misled", playList);
        albums.get(0).addToPlayList("Love doesn't ask why", playList);
        //albums.get(0).addToPlayList("I love home", playList);
        albums.get(1).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        //albums.get(1).addToPlayList(24, playList);
        
        //method to play our playlist
        play(playList);

    }
    
    private static void play(LinkedList<Song> playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in the playlist ");
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
        }
       
    }

}
