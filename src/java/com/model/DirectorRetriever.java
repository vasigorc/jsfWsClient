/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author vasigorc
 */
@Named(value = "directorRetriever")
@ViewScoped
public class DirectorRetriever implements Serializable{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ajaxandxml/MovieBillService.wsdl")
    private MovieBillService service= new MovieBillService();
    private String selectedDirector="";
    private ArrayList<String> directorMovies = new ArrayList<>();

    /**
     * Creates a new instance of DirectorRetriever
     */
    public DirectorRetriever() {
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
    
    public void listMovies() {
        //we must first delete the movies selected for the previous actor
        this.directorMovies.clear();
        //populate with new entries
        try {
            this.directorMovies = (ArrayList<String>) findDirectorMovies(selectedDirector);
        } catch (IOException_Exception ex) {
            Logger.getLogger(ActorRetriever.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.directorMovies.isEmpty()) {
            this.directorMovies.add(" didn't shoot any movies");
        }
        Logger.getLogger(ActorRetriever.class.getName()).log(Level.INFO, directorMovies.get(0));
    }

    private java.util.List<java.lang.String> findDirectorMovies(java.lang.String directorName) throws IOException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.model.MovieBill port = service.getMovieBillPort();
        return port.findDirectorMovies(directorName);
    }
    
    public ArrayList<String> getDirectorMovies() {
        return directorMovies;
    }

    public void setActorMovies(ArrayList<String> actorMovies) {
        this.directorMovies = actorMovies;
    }    
}
