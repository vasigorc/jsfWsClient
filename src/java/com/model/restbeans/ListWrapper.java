/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.restbeans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * We will use this utility class as a wrapper for our ArrayList to send to the
 * client
 *
 * @author vasigorc
 */
@XmlRootElement(name = "groups")
public class ListWrapper {

    protected ArrayList<String> group;

    public ListWrapper() {
        group = new ArrayList<String>();
    }

    public ListWrapper(ArrayList<String> group) {
        this.group = group;
    }
    /**
     * Gets the value of the group property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the group property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     *
     *
     * @return 
     */
    @XmlElement(name="group")
    public ArrayList<String> getGroup(){
        if (group==null)
            group = new ArrayList<>();       
        return this.group;
    }
}
