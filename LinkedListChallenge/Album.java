import java.util.ArrayList;

public class Album {
    private String name;
    // private ArrayList<Song> songList;
    private SongList songs;
    

    public Album(String name){
        this.name = name;
        // songList = new ArrayList<Song>();
        songs = new SongList();
    }

    public String getName() {
        return name;
    }
    // public ArrayList<Song> getSongList() {
    //     return songList;
    // }

    public SongList getSongs() {
        return songs;
    }
    

    // public boolean addSong(String title, String duration){
    //     Song existiSong = findSong(title);
    //     if (existiSong == null) {
    //         this.songList.add(new Song(title, duration));
    //         return true;
    //     }
    //     System.out.println("Song alread exist");
    //    return false;
    // }

    public boolean addSong(String title, String duration) {
        boolean state = songs.addSong(title, duration);
        return state;
    }

    public ArrayList<Song> getSongList(){
        return songs.getSongList();
    }

    public boolean removeSong(String title){
        Song existiSong = songs.findSong(title);
        if (existiSong != null) {
            for (int i = 0; i < songs.songList.size(); i++) {
                if (songs.songList.get(i) == existiSong) {
                    songs.songList.remove(i);
                    return true;
                }
            }
        }
        System.out.println("The song is not found");
       return false;
    }

    // private Song findSong(String title){
    //     for (int i = 0; i < songList.size() ; i++) {
    //         String existingName = songList.get(i).getTitle();
    //         if (existingName.toLowerCase().equals(title.toLowerCase()) ) {
    //             return songList.get(i);
    //         }
    //     }
    //     return null;
    // }

    /**
     * SongList inner class
     */
    private class SongList {
        private ArrayList<Song> songList;

        public SongList(){
            this.songList = new ArrayList<>();
        }


        public ArrayList<Song> getSongList() {
            return songList;
        }

        public boolean addSong(String title, String duration){
            Song existiSong = findSong(title);
            if (existiSong == null) {
                this.songList.add(new Song(title, duration));
                return true;
            }
            System.out.println("Song alread exist");
        return false;
        }

        private Song findSong(String title){
            for (int i = 0; i < songList.size() ; i++) {
                String existingName = songList.get(i).getTitle();
                if (existingName.toLowerCase().equals(title.toLowerCase()) ) {
                    return songList.get(i);
                }
            }
            return null;
        }
    }
    
}
