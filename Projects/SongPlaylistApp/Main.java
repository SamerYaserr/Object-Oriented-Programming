import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        LinkedList<Song> playList = new LinkedList<>();

        Album album1 = new Album("Love", "Samer");
        album1.addSong("Ba7bek", 3.0);
        album1.addSong("Wa7chteny", 2.0);
        album1.addSong("InLove", 3);

        Album album2 = new Album("Study", "Samer");
        album2.addSong("Read", 3.0);
        album2.addSong("Write", 2.0);
        album2.addSong("Study", 3);

        album1.addToPlayList(1, playList);
        album1.addToPlayList(2, playList);
        album1.addToPlayList("InLove", playList);
        album2.addToPlayList(1, playList);
        album2.addToPlayList(2, playList);
        album2.addToPlayList("Study", playList);


        play(playList);

    }


    private static void play(LinkedList<Song> playList) {

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {

            System.out.println("This playlist have no song");

        } else {

            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();

        }

        while (!quit) {

            int action = in.nextInt();
            in.nextLine();

            switch (action) {

                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:

                    if (!forward) {

                        if (listIterator.hasNext())
                            listIterator.next();

                        forward = true;
                    }

                    if (listIterator.hasNext()) {

                        System.out.println("Now playing " + listIterator.next().toString());

                    } else {

                        System.out.println("No song available, reached to the end of the list");

                    }

                    break;

                case 2:

                    if (forward) {

                        if (listIterator.hasPrevious())
                            listIterator.previous();

                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {

                        System.out.println("Now playing " + listIterator.previous().toString());

                    } else {

                        System.out.println("We are the first song");

                    }

                    break;

                case 3:

                    if (forward) {

                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = false;

                    } else {

                        System.out.println("now playing " + listIterator.next().toString());
                        forward = true;

                    }

                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {

                        listIterator.remove();

                        if (listIterator.hasNext()) {

                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;

                        } else {

                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;

                        }

                    } else {

                        System.out.println("This playlist has no songs");
                    }
            }
        }

    }

    private static void printMenu() {

        System.out.println("Available options\npress");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - list of all songs");
        System.out.println("5 - print all available options");
        System.out.println("6 - delete current song");

    }

    private static void printList(LinkedList<Song> playList) {

        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------------------");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");

    }
}