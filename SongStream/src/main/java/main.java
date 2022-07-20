/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.util.*;
import java.util.stream.Collectors;
public class main {
    public static void main(String[] args) {
        Songs songs = new Songs();
        List<Song> rockGenre = songs.getSongs().stream()
                .filter(s -> s.getGenre().contains("rock") || s.getGenre().contains("Rock"))
                .sorted((a,b) -> a.getTitle().compareToIgnoreCase(b.getTitle()))
                .collect(Collectors.toUnmodifiableList());    
        
        List<Song> byBeatlesStartsWithHRecent1995 = songs.getSongs().stream()
                .filter(s -> s.getArtist().contains("Beatles") || s.getTitle().startsWith("S") || s.getYear() > 1995)
                .collect(Collectors.toUnmodifiableList());
        
        List<String> genres = songs.getSongs().stream()
                .map(s -> s.getGenre())
                .distinct()
                .collect(Collectors.toList());
        
        String songTitle = "Hurt";
        List<String> artistsCoveringSongs = songs.getSongs().stream()
                .filter(s -> s.getTitle().equalsIgnoreCase(songTitle))
                .map(s -> s.getArtist())
                .filter(a -> !a.equalsIgnoreCase("Nine Inch Nails"))
                .collect(Collectors.toList());
        
        String artists = songs.getSongs().stream()
                .map(s -> s.getArtist())
                .distinct()
                .collect(Collectors.joining(", "));
                /*contatenates a string of all the artists in the collection and 
                adds a ", " delimiter delimiter is useful if you want to turn 
                stream into a String of csv's*/
        
        String top5Songs = songs.getSongs().stream()
                .distinct()
                .sorted((a,b) -> b.getTimesPlayed()-a.getTimesPlayed())//descending order of popularity
                //ascending would be ...-> a.getTimesPlayed()-b.getTimesPlayed())
                .limit(5)
                .map(Song::getTitle)
                .collect(Collectors.joining(", "));

        List<Song> orderedByPopularity = songs.getSongs().stream()
                .sorted((a,b) -> b.getTimesPlayed()-a.getTimesPlayed())//descending order of popularity
                .collect(Collectors.toList());

        
        boolean result = songs.getSongs().stream()
                .anyMatch(s -> s.getGenre().equals("EDM"));
                //returns true if in the stream, otherwise returns false
        
        long count = songs.getSongs().stream()
                .map(Song::getArtist)//method reference instead of lamba
              //.map(s -> s.getArtist())//lambda equivalent
                .distinct()
                .count();
                //counts number of unique artists from the collection
        
                
    }
}
