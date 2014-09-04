/**
 * This is the entire list of Songs
 */
 
public class Library { // clase en donde va a tener contenida en una lista todos los nodos que contienen canciones.
    SongNode  First; //Puntero al primer nodo de la lista
     // Puntero al ultimo nodo de la lista
    
       
    
    /**
    *Este es el metodo que verifica si la lista esta vacia
    *primero empieza con un una sentencia if preugntando que si el primer
    *elemento de la lista es nullo si o es retorna un True y si no
    *retorna un False
    */
    public boolean empty(){ 
        if (First==null)                   
            return true;
        else
            return false;
    }
    
    
    /**
    *Este es el metetodo de insercion , es insercion al final
    *el metodo recibe como parametos los parametros del nodo para luego llamar al constructor del nodo
    *en primer lugar pregunta si la lista esta vacia, si estubiera vacia solo llama al cosntructor del nodo y asiga los punteros de primero y de ultimo la la instancia
    *si tubiera un elemento, genera la instancia del nodo y coloca el puntero de ultimo al nodo nuevo generado
    */
    public Library InsertEnd(String Name, String Artist, String Genre, String Album, int Time, String Cover, String Path){
        if (empty()){
             First = new SongNode(Name,Artist,Genre,Album,Time,Cover,Path);
            
            
        }
        else{
            First = new SongNode(Name,Artist,Genre,Album,Time,Cover,Path,First);
            
        }
        return this;
    }
    /**
    *Metodo que busca por artista
    *Para  hacer el algoritmo se necesitan una nueva lista donde se van acumular los resultados de la busqueda
    *un puntero auxiliar para hacer las iteracione y recorrer la lista
    *luego genera un ciclo while donde se va a recorrer la lista e ir buscando cuales de los nodos cumplen con lo buscado
    *si el nodo no contiene lo buscado solo sigue adelante, al final se tendra una lista con los nodos que contengan lo que se busca
    */
    
    public Library SearchArtist(String search){
        SongNode Aux;
        Library artistlist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != null){
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
    
    /**
    *Metodo que busca por album
    *Para  hacer el algoritmo se necesitan una nueva lista donde se van acumular los resultados de la busqueda
    *un puntero auxiliar para hacer las iteracione y recorrer la lista
    *luego genera un ciclo while donde se va a recorrer la lista e ir buscando cuales de los nodos cumplen con lo buscado
    *si el nodo no contiene lo buscado solo sigue adelante, al final se tendra una lista con los nodos que contengan lo que se busca
    */
    
    public Library SearchAlbum(String search){
        Library albumlist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != null){
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
    
    /**
    *Metodo que busca por genre
    *Para  hacer el algoritmo se necesitan una nueva lista donde se van acumular los resultados de la busqueda
    *un puntero auxiliar para hacer las iteracione y recorrer la lista
    *luego genera un ciclo while donde se va a recorrer la lista e ir buscando cuales de los nodos cumplen con lo buscado
    *si el nodo no contiene lo buscado solo sigue adelante, al final se tendra una lista con los nodos que contengan lo que se busca
    */
    
    public Library SearchGenre(String search){
        Library genrelist = new Library ();
        SongNode prev = null;
        SongNode here = First;
        while (here != null){
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
    
    /**
    *Metodo que busca por nombre
    *Para  hacer el algoritmo se necesitan una nueva lista donde se van acumular los resultados de la busqueda
    *un puntero auxiliar para hacer las iteracione y recorrer la lista
    *luego genera un ciclo while donde se va a recorrer la lista e ir buscando cuales de los nodos cumplen con lo buscado
    *si el nodo no contiene lo buscado solo sigue adelante, al final se tendra una lista con los nodos que contengan lo que se busca
    */
    
    public Library SearchName(String search){
        Library namelist = new Library ();
        SongNode here = First;
        while (here != null){
            if (here.Name == search){
                namelist.InsertEnd(here.Name, here.Artist, here.Genre, here.Album, here.Time, here.Cover, here.Path);
                here = here.next;
            }
            else{
                here=here.next;
            }
         
        }
        return namelist;
       
       
    }
    /**
    *metodo que imprime en consola
    */
    
    public void printconsole(){
        SongNode here = First;
        while(here!=null){
            System.out.println(here.Name);
            here=here.next;
        }
       
    }
    
    /**
    *Metodo delete
    *En este metodo hace una busqueda por nombre que cuando encuentra el nodo con el nombre buscado
    *se ajustan los punteros al siguiente y al anterior para eliminar y asi el recolector de basura destruye el 
    *nodo.
    */
    
    public boolean delete(String name){
        SongNode here = First;
        while(here!=null){
            if (here.Name==name){
                if(First==null){
                    First = here.next;
                    ;
                }
                else{
                    First.next = here.next;
                    SongNode temp = here.next;
                    
                }
                return true;
                }
            First=here;
            here=here.next;
            }
        if (name==Last.Name){
            Last=here.prev;
            return true;
        }
        return false;
    }
    
}
