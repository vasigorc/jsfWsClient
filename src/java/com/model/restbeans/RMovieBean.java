/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.restbeans;

import com.model.rest.MovieJerseyClient;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author vasigorc
 */
@Named(value = "rMovieBean")
@ViewScoped
public class RMovieBean implements Serializable {

    private String usrSelection;
    private Movie movie;
    private MovieJerseyClient mjc;

    /**
     * Creates a new instance of RMovieBean
     */
    public RMovieBean() {
    }

    public String getUsrSelection() {
        return usrSelection;
    }

    public void setUsrSelection(String usrSelection) {
        this.usrSelection = usrSelection;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void findMovie() {
        this.movie = mjc.getMovieInfo(Movie.class, usrSelection);

    }

    public static void main(String[] args) {
        RMovieBean mr = new RMovieBean();
        mr.setUsrSelection("Click");
        mr.findMovie();
        System.out.println(mr.movie.getReleased());

    }
}
