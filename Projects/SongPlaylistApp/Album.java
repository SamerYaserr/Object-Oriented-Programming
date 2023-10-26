import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    ArrayList<Song> songs ;

    public Album( String name , String artist ){

        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();

    }

    public Song findSong( String title ){

        for( Song checkSong : songs ){

            if( checkSong.getTitle().equals( title ) )
                return checkSong;

        }

        return null;
    }

    public boolean addSong( String title , double duration ){

        if( findSong( title ) == null ){

            songs.add( new Song( title , duration ) );
            //System.out.println( title + " successfully added to the album");
            return true;

        }else{

            //System.out.println("Song with title " + title + " already exist int the album");
            return false;

        }
    }

    public boolean addToPlayList(int trackNumber , LinkedList<Song>playList ){

        int index = trackNumber - 1;

        if( trackNumber >= 1 && trackNumber <= songs.size() ){

            playList.add( songs.get( index ));
            //System.out.println("Song with tracknumber " + trackNumber + " successfully added to the playlist" );
            return true;

        }

        //System.out.println("this album does not have song with tracknumber " + trackNumber  );
        return false;

    }

    public boolean addToPlayList(String title , LinkedList<Song>playList ){

        Song song = findSong( title );

        if( song != null ){

            playList.add( song );
            //System.out.println("Song with title " + title + " successfully added to the playlist" );
            return true;

        }

        //System.out.println("this album does not have song with title " + title );
        return false;

    }



}
