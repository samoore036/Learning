/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;
    
    public Song(String t, String a, String g, int y, int times) {
        this.title = t;
        this.artist = a;
        this.genre = g;
        this.year = y;
        this.timesPlayed = times;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public int getTimesPlayed() {
        return this.timesPlayed;
    }
    
    @Override
    public String toString() {
        return String.format("\"%s\", by %s (%s), times played: %s", this.title,this.artist,this.year,this.timesPlayed);
    }
}
