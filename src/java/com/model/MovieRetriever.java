/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vasigorc
 */
@Named(value = "movieRetriever")
@SessionScoped
public class MovieRetriever implements Serializable {
    private String usrSelection;
    private Movie movie;
    private MovieBill ws;
    private boolean movieFound = true;

    /**
     * Creates a new instance of MovieRetriever
     */
    public MovieRetriever() {
    }

    public String getUsrSelection() {
        return usrSelection;
    }

    public void setUsrSelection(String usrSelection) {
        this.usrSelection = usrSelection;
    }

    public Movie getMovie() {
        try {
            this.movie = ws.findMovieInfo(usrSelection);
        } catch (IOException_Exception ex) {
            Logger.getLogger(MovieRetriever.class.getName()).log(Level.SEVERE, null, ex);
        }
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void findMovie() {
        try {
            this.movie = ws.findMovieInfo(usrSelection);
        } catch (IOException_Exception ex) {
            Logger.getLogger(MovieRetriever.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isMovieFound() {
        return movieFound;
    }

    public void setMovieFound(boolean movieFound) {
        this.movieFound = movieFound;
    }
}
