package fundamental lessons.Methods.toString;

public class Song {
    
    private String title;
    private String artist;
    private int plays;

    public Song(String title, String artist) {
        this.title = title;
        this.artist= artist;
        plays = 0;
    }

    public void play() {
        plays++;
    }

    public int getPlays() {
        System.out.println(plays);
        return plays;
    }

    public String toString() {
        return title + " by " + artist
    }
}
