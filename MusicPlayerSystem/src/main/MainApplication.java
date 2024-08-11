package main;

import listenfiy.Album;
import listenfiy.Song;

import java.util.ArrayList;
import java.util.*;

public class MainApplication {


    public static void main(String[] args) {


        List<Song> songList1 = new ArrayList<>();
        Song song1 = new Song("Channa mereya", 4.35);
        songList1.add(song1);

        Song song2 = new Song("Tu jo mila", 3.45);
        songList1.add(song2);

        Song song3 = new Song("Disco Divana", 2.15);
        songList1.add(song3);


        Album album1 = new Album("Old Songs", "Old artist", songList1);
        System.out.println(album1);


        //enter the song name and than cheak it is present or not
        Scanner sc = new Scanner(System.in);
        String tittelofsong = sc.nextLine();


        boolean songpresent = album1.findSongsInAlbum(tittelofsong);
        System.out.println(songpresent);
        if (songpresent) {
            System.out.println("song " + tittelofsong + " is playing");
        } else {
            System.out.println("song " + tittelofsong + " is  not found");
        }


        System.out.println("Do you want to play previouse or next song");//previous -1,next =1;
        int previousOrNext=sc.nextInt();
        if(previousOrNext==1)
        {
          playNext(album1,tittelofsong);

        }
        else if(previousOrNext==-1)
        {
            playPriviouse(album1,tittelofsong);
        }
        else{
            System.out.println("Replaying  same song"+tittelofsong);
        }
    }


    // playing previous song
    public static void playPriviouse(Album album, String titleofSong) {

        List<Song> songList = album.getSongsList();
        for (int i = 1; i < songList.size(); i++) {
            if(album.findSongsInAlbum(titleofSong)) {

                System.out.println("Preivious song playing is ::"+ songList.get(i-1).getTitle());
            }

        }
    }


    // playing next song
    public static void playNext(Album album, String titleofSong) {

        List<Song> songList = album.getSongsList();

        for (int i = 0; i < songList.size(); i++) {
            if(album.findSongsInAlbum(titleofSong)) {

                System.out.println("Preivious song playing is ::"+ songList.get(i+1).getTitle());
            }

        }
    }

}

