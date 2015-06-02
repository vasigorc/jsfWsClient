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
@Named(value = "rActorMovies")
@ViewScoped
public class RActorMovies implements Serializable {

    private String selectedActor = "";
    private MoviesJerseyClient mjc = new MoviesJerseyClient();
    private ArrayList<String> actorMovies = new ArrayList<>();
    private ListWrapper lw;

    /**
     * Creates a new instance of RActorMovies
     */
    public RActorMovies() {
    }

    public String getSelectedActor() {
        if (selectedActor.length() < 1)
            return selectedActor + "";
        else
            return selectedActor + ": ";
    }

    public void setSelectedActor(String selectedActor) {
        this.selectedActor = selectedActor;
        listMovies();
    }

    public ArrayList<String> getActorMovies() {
        return actorMovies;
    }

    public void setActorMovies(ArrayList<String> actorMovies) {
        this.actorMovies = actorMovies;
    }

    public void listMovies(){
        /*
        We copied the ListWrapper classs to "make available" the ArrayList 
        from the REST service for this bean's ArrayList property
        */
        this.actorMovies.clear();
        this.lw = mjc.getActorMovies(ListWrapper.class, selectedActor);
        this.actorMovies = lw.getGroup();
    }
    
//    public static void main(String[] args) {
//        RActorMovies ram = new RActorMovies();
//        ram.setSelectedActor("Bruce Willis");
//        System.out.println(ram.getActorMovies().toString());
//    }
}

        