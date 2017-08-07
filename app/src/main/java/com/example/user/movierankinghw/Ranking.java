package com.example.user.movierankinghw;

/**
 * Created by user on 07/08/2017.
 */

public class Ranking {

    private Movie[] ranking;

    public Ranking(){
        this.ranking = new Movie[10];
    }


    public int getCount() {
        int movies = 0;
        for (Movie i : this.ranking){
            if(i != null){
                movies++;
            }
        }
        return movies;
    }


    public void addMovie(Movie newMovie) {
        int getCount  = getCount();
        ranking[getCount] = newMovie;
    }

    public String getMovieByRank(int rank){
        int index = rank -1;
        Movie m = ranking[index];
        return m.getTitle();
    }
}
