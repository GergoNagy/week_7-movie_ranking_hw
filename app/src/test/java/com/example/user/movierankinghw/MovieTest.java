package com.example.user.movierankinghw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("Hobbit", "JRR Tolkin", 10);
    }

    @Test
    public void testHasTitle(){
        assertEquals("Hobbit", movie.getTitle());
    }

    @Test
    public void testSetTitle(){
        movie.addTitle("Lord of the rings");
        assertEquals("Lord of the rings", movie.getTitle());

    }

    @Test
    public void testHasGenre(){
        assertEquals("JRR Tolkin", movie.getGenre());
    }

    @Test
    public void testSetNewGenre(){
        movie.addGenre("Bob");
        assertEquals("Bob", movie.getGenre());
    }

    @Test
    public void testHasRanking(){
        assertEquals(10, movie.getRanking());
    }

    @Test
    public void testNewRanking(){
        movie.addRanking(9);
        assertEquals(9, movie.getRanking());
    }

    @Test
    public void testMovieDetails(){
        assertEquals("Title: Hobbit, Genre: JRR Tolkin, Ranking: 10", movie.toString());
    }

}
