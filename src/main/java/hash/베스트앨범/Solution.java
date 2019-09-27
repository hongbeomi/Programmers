package hash.베스트앨범;

import java.util.*;
import java.util.stream.*;

public class Solution {

  public int[] solution(String[] genres, int[] plays) {
    return IntStream.range(0, genres.length)
        .mapToObj(i -> new Song(genres[i], plays[i], i))
        .collect(Collectors.groupingBy(Song::getGenre))
        .entrySet()
        .stream()
        .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
        .flatMap(s -> s.getValue().stream().sorted().limit(2))
        .mapToInt(s -> s.num).toArray();
  }

  public static class Song implements Comparable<Song>{

    private int play;
    private int num;
    private String genre;

    public Song(String genre, int play, int num) {
      this.genre = genre;
      this.play = play;
      this.num = num;
    }

    @Override
    public int compareTo(Song song) {
      if(this.play == song.play) {
        return this.num - song.num;
      }
      return song.play - this.play;
    }

    public String getGenre() {return genre;}
  }

  private int sum(List<Song> value) {
    int answer = 0;
    for (Song song : value) {
      answer+= song.play;
    }
    return answer;
  }

}
