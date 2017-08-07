package com.example.user.movierankinghw;

/**
 * Created by user on 07/08/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle(){
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void addTitle(String newTitle) {
        this.title = newTitle;
    }

    public void addGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void addRanking(int newRanking) {
        this.ranking = newRanking;
    }

    public String toString(){
        return ("Title: " + this.title + ", Genre: " + this.genre + ", Ranking: " + this.ranking);
    }
}
