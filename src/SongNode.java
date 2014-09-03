/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco_197
 */
public class SongNode {
    String Name;
    String Artist;
    String Genre;
    String Album;
    int Time;
    String Cover;
    String Path;
    SongNode next;
    SongNode prev;
    /**
    *metodo de constructor .
    */

    public SongNode(String Name, String Artist, String Genre, String Album, int Time, String Cover, String Path) {
        this.Name = Name;
        this.Artist = Artist;
        this.Genre = Genre;
        this.Album = Album;
        this.Time = Time;
        this.Cover = Cover;
        this.Path = Path;
        this.next = null;
        this.prev = null;
    }
    
    /**
    *Estos son los metodos para poder asignar los valores a los nodos.
    *setname 
    *set artist
    *set genre
    *set album
    *set time
    *set path
    */

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public void setCover(String Cover) {
        this.Cover = Cover;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }
    
   
    
}
