package listenfiy;

import java.util.List;

public class Album {

private String albumname;
private String artistname;
public static List<Song> songsList;


    public Album(String albumname, String artistname, List<Song> songsList) {
        this.albumname = albumname;
        this.artistname = artistname;
        this.songsList = songsList;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }

    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname;
    }

    public List<Song> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<Song> songsList) {
        this.songsList = songsList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumname='" + albumname + '\'' +
                ", artistname='" + artistname + '\'' +
                ", songsList=" + songsList +
                '}';
    }


    public boolean findSongsInAlbum(String title){
        // travers using for each loop and get the song from list of song
        for (Song song: getSongsList()){
            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public String addSongsToTheAlbum(Song song){
     //cheak if the song is already present or not
        //if not present we can add it into songlist

        boolean songAlredypresent=findSongsInAlbum(song.getTitle());
        if(songAlredypresent){
            return "Song is Already present ";
        }
        else {
            //we need add it to songlist
            songsList.add(song);
            return "New song has been added successfully";
        }
    }




}
