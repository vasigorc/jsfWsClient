/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.restbeans;

import com.model.rest.MoviesJerseyClient;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author vasigorc
 */
@Named(value = "rDirectorMovies")
@ViewScoped
public class RDirectorMovies implements Serializable {

    private String selectedDirector = "";
    private ArrayList<String> directorMovies = new ArrayList<>();
    private final MoviesJerseyClient mjc = new MoviesJerseyClient();
    
    private ListWrapper lw;

    /**
     * Creates a new instance of RDirectorMovies
     */
    public RDirectorMovies() {
    }

    public String getSelectedDirector() {
        if (selectedDirector.length() < 1) {
            return selectedDirector + "";
        } else {
            return selectedDirector + ": ";
        }
    }

    public void setSelectedDirector(String selectedDirector) {
        this.selectedDirector = selectedDirector;
        listMovies();
    }

    public ArrayList<String> getDirectorMovies() {
        return directorMovies;
    }

    public void setDirectorMovies(ArrayList<String> directorMovies) {
        this.directorMovies = directorMovies;
    }

    public void listMovies() {
        /*
         We copied the ListWrapper classs to "make available" the ArrayList 
         from the REST service for this bean's ArrayList property
         */
        this.directorMovies.clear();
        this.lw = mjc.getDirectorMovies(ListWrapper.class, selectedDirector);
        this.directorMovies = lw.getGroup();
    }

    public ListWrapper getLw() {
        return lw;
    }    
    
//    public static void main(String[] args) {
//        RDirectorMovies ram = new RDirectorMovies();
//        ram.setSelectedDirector("Frank Coraci");
//        System.out.println(ram.getDirectorMovies().toString());
//    }
}
