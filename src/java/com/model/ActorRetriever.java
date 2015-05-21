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
@Named(value = "actorRetriever")
@ViewScoped
public class ActorRetriever implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ajaxandxml/MovieBillService.wsdl")
    private MovieBillService service = new MovieBillService();
    private String selectedActor = "";
    private ArrayList<String> actorMovies = new ArrayList<>();

    /**
     * Creates a new instance of ActorRetriever
     */
    public ActorRetriever() {
    }

    public String getSelectedActor() {
        if (selectedActor.length() < 1) {
            return selectedActor + "";
        } else {
            return selectedActor + ": ";
        }
    }

    public void setSelectedActor(String selectedActor) {
        this.selectedActor = selectedActor;
    }

    public void listMovies() {
        //we must first delete the movies selected for the previous actor
        this.actorMovies.clear();
        //populate with new entries
        try {
            this.actorMovies = (ArrayList<String>) findActorMovies(selectedActor);
        } catch (IOException_Exception ex) {
            Logger.getLogger(ActorRetriever.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.actorMovies.isEmpty()) {
            this.actorMovies.add(" didn't play in any movies");
        }
        Logger.getLogger(ActorRetriever.class.getName()).log(Level.INFO, actorMovies.get(0));
    }

    private java.util.List<java.lang.String> findActorMovies(java.lang.String actorName) throws IOException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.model.MovieBill port = service.getMovieBillPort();
        return port.findActorMovies(actorName);
    }

    public ArrayList<String> getActorMovies() {
        return actorMovies;
    }

    public void setActorMovies(ArrayList<String> actorMovies) {
        this.actorMovies = actorMovies;
    }
}
