/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.restbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author vasigorc
 */
@Named(value = "restService")
@SessionScoped
public class RestServicePicker implements Serializable {

    private String choice = "Movie";
    private int index = 3;

    /**
     * Creates a new instance of RestServicePicker
     */
    public RestServicePicker() {
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
        /*
         Change the index value
         */
        switch (choice) {
            case "Movie":
                this.index = 3;
                break;
            case "Director":
                this.index = 2;
                break;
            case "Actor":
                this.index = 1;
                break;
            default:
                break;
        }
    }
    
    //methods for determining the current tab
    public boolean isActorCurrent() {
        return index == 1;
    }

    public boolean isDirectorCurrent() {
        return index == 2;
    }

    public boolean isMovieCurrent() {
        return index == 3;
    }
}
