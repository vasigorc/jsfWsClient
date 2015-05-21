/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author vasigorc
 */
@Named(value = "service")
@SessionScoped
public class ServicePicker implements Serializable {

    private String choice = "Movie";
    private int index = 3;

    /**
     * Creates a new instance of ServicePicker
     */
    public ServicePicker() {
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
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

    //change the index' value
    public void tabPicker(ValueChangeEvent event) {

        String newChoice = (String) event.getNewValue();
        switch (newChoice) {
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
}
