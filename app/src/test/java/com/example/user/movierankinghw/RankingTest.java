package com.example.user.movierankinghw;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class RankingTest {

    Ranking ranking;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;

    @Before
    public void before(){
        ranking = new Ranking();
        movie1 = new Movie("Movie1", "Genre1", 1);
        movie2 = new Movie("Movie2", "Genre2", 2);
        movie3 = new Movie("Movie3", "Genre3", 3);
        movie4 = new Movie("Movie4", "Genre4", 4);
        movie5 = new Movie("Movie5", "Genre5", 5);
        movie6 = new Movie("Movie6", "Genre6", 6);
        movie7 = new Movie("Movie7", "Genre7", 7);
        movie8 = new Movie("Movie8", "Genre8", 8);
        movie9 = new Movie("Movie9", "Genre9", 9);
        movie10 = new Movie("Movie10", "Genre10", 10);
    }

    @Test
    public void testToString(){
        assertEquals("Title: Movie1, Genre: Genre1, Ranking: 1", movie1.toString());
    }

    @Test
    public void testsetTheArray(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        assertEquals(2, ranking.getCount());
    }

    @Test
    public void testHaveMovieInRankingArray(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        assertEquals("Movie2", ranking.getMovieByRank(2));
    }


}
