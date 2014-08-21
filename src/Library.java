//This is the entire list of Songs
public class Library {
    SongNode  First;
    SongNode  Last;
    {
        First = null;
        Last = null;
    }
    
    public boolean empty(){
        if (First==null)
            return true;
        else
            return false;
    }
    
    public Library InsertEnd(String Name, String Artist, String Genre, String Album, int Time, String Cover, String Path){
        if (empty()){
            SongNode song = new SongNode(Name,Artist,Genre,Album,Time,Cover,Path);
            First = song;
            Last= song;
        }
        else{
            SongNode song = new SongNode(Name,Artist,Genre,Album,Time,Cover,Path);
            Last.next=song;
            song.prev=Last;
            Last=song;
        }
        return this;
    }
    
    public Library SearchArtist(String search){
        Library artistlist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != Last){
            if (here.Artist==search){
                artistlist.InsertEnd(here.Name, here.Artist, here.Genre, here.Album, here.Time, here.Cover, here.Path);
                here = here.next;
            }
            else{
                here=here.next;
            }
         
        }
        return artistlist;
       
       
    }
    
    public Library SearchAlbum(String search){
        Library albumlist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != Last){
            if (here.Album == search){
                albumlist.InsertEnd(here.Name, here.Artist, here.Genre, here.Album, here.Time, here.Cover, here.Path);
                here = here.next;
            }
            else{
                here=here.next;
            }
         
        }
        return albumlist;
       
       
    }
    
    public Library SearchGenre(String search){
        Library genrelist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != Last){
            if (here.Genre == search){
                genrelist.InsertEnd(here.Name, here.Artist, here.Genre, here.Album, here.Time, here.Cover, here.Path);
                here = here.next;
            }
            else{
                here=here.next;
            }
         
        }
        return genrelist;
       
       
    }
    
    public Library SearchName(String search){
        Library namelist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != Last){
            if (here.Genre == search){
                namelist.InsertEnd(here.Name, here.Artist, here.Genre, here.Album, here.Time, here.Cover, here.Path);
                here = here.next;
            }
            else{
                here=here.next;
            }
         
        }
        return namelist;
       
       
    }
    
    public void printconsole(){
        SongNode here = First;
        while(here!=Last){
            System.out.println(here.Name);
            here=here.next;
        }
        if (here==Last)
            System.out.println(here.Name);
    }
    
    
    public boolean delete(String name){
        SongNode prev = null;
        SongNode here = First;
        while(here!=Last){
            if (here.Name==name){
                if(prev==null){
                    First = here.next;
                    First.prev=null;
                }
                else{
                    prev.next = here.next;
                    SongNode temp = here.next;
                    temp.prev=prev;
                }
                return true;
                }
            prev=here;
            here=here.next;
            }
        if (name==Last.Name){
            Last=here.prev;
            return true;
        }
        return false;
    }
    
}
