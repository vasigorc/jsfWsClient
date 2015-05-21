/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author vasigorc
 */
@Named(value = "movieRetriever")
@ViewScoped
public class MovieRetriever implements Serializable {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ajaxandxml/MovieBillService.wsdl")
    private MovieBillService service = new MovieBillService();
    private String usrSelection;
    private Movie movie;
    private boolean movieFound;

    /**
     * Creates a new instance of MovieRetriever
     */
    public MovieRetriever() {
        movieFound = false;
    }

    public String getUsrSelection() {
        return usrSelection;
    }

    public void setUsrSelection(String usrSelection) {
        this.usrSelection = usrSelection;
        findMovie();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void findMovie() {
        movieFound = true;
        try {
            this.movie = findMovieInfo(usrSelection);
        } catch (IOException_Exception ex) {
            Logger.getLogger(MovieRetriever.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isMovieFound() {
        return movieFound;
    }

    public void setMovieFound(boolean movieFound) {
        this.movieFound = movieFound;
    }

    private Movie findMovieInfo(java.lang.String title) throws IOException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.model.MovieBill port = service.getMovieBillPort();
        return port.findMovieInfo(title);
    }
    
//    public static void main(String[] args){
//        MovieRetriever mr = new MovieRetriever();
//        try {
//            mr.movie = mr.findMovieInfo("Click");
//            System.out.println(mr.movie.getReleased());
//        } catch (IOException_Exception ex) {
//            Logger.getLogger(MovieRetriever.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
