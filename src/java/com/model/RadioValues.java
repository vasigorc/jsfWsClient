/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.TreeSet;

/**
 *
 * @author vasigorc
 */
@Named(value="radio")
@SessionScoped
public class RadioValues implements Serializable {

    private TreeSet<String> radioChoices = new TreeSet<>();

    /**
     * Creates a new instance of RadioValues
     */
    public RadioValues() {
        radioChoices.add("Movie");
        radioChoices.add("Actor");
        radioChoices.add("Director");
    }

    public TreeSet<String> getRadioChoices() {
        return radioChoices;
    }
}
