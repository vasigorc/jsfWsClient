/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author vasigorc
 */
@Named(value = "moviesTitles")
@SessionScoped
public class MoviesTitles implements Serializable {

    private ArrayList<String> movies = new ArrayList<>();
    /**
     * Creates a new instance of MoviesTitles
     */
    public MoviesTitles() {
        movies.add("The Break-Up");
        movies.add("Cars");
        movies.add("Click");
        movies.add("District B–13 (Banlieu 13)");
        movies.add("Garfield: A Tail of Two Kitties");
        movies.add("The Heart of the Game");
        movies.add("An Inconvenient Truth");
        movies.add("Keeping Up with Steins");
        movies.add("Krrish");
        movies.add("The Lake House");
        movies.add("The Lost City");
        movies.add("Over the Hedge");
        movies.add("A Prairie Home Companion");
        movies.add("The Road to Guantanamo");
        movies.add("Worldplay");
    }
    
    public ArrayList getMovies(){
        return movies;
    }
}
