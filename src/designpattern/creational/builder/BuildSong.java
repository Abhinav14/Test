package designpattern.creational.builder;

public class BuildSong {
    public static void main(String[] args) {
        Song song = new Song.Builder().setTitle("Na to karvan ki talash hai").setSingerName("Mohd. Rafi").setMovieName("Barsaat Ki Raat").build();
        System.out.println(song);
    }
}
