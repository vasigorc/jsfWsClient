
package com.model.restbeans;

import com.model.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour movie complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showingon" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="released" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noPasses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="actors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="producers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="writers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="studios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="movie")
public class Movie {

    protected String duration;
    protected List<String> showingon;
    protected String released;
    protected String title;
    protected String genre;
    protected String rank;
    protected boolean noPasses;
    protected List<String> actors;
    protected List<String> directors;
    protected List<String> producers;
    protected List<String> writers;
    protected List<String> studios;

    public Movie() {
        this("duration", new ArrayList<String>(), "released", "title", "genre", "rank", true, new ArrayList<String>(), new ArrayList<String>(), 
                new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>());
    }

    public Movie(String duration, List<String> showingon, String released, String title, String genre, String rank, boolean noPasses, List<String> actors, List<String> directors, List<String> producers, List<String> writers, List<String> studios) {
        this.duration = duration;
        this.showingon = showingon;
        this.released = released;
        this.title = title;
        this.genre = genre;
        this.rank = rank;
        this.noPasses = noPasses;
        this.actors = actors;
        this.directors = directors;
        this.producers = producers;
        this.writers = writers;
        this.studios = studios;
    }
    
    

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    
    
    @XmlElement(name="duration")
    public String getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the showingon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the showingon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowingon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @XmlElement(name="showingon")
    public List<String> getShowingon() {
        if (showingon == null) {
            showingon = new ArrayList<String>();
        }
        return this.showingon;
    }

    /**
     * Obtient la valeur de la propriété released.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name="released")
    public String getReleased() {
        return released;
    }

    /**
     * Définit la valeur de la propriété released.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleased(String value) {
        this.released = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name="title")
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété genre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name="genre")
    public String getGenre() {
        return genre;
    }

    /**
     * Définit la valeur de la propriété genre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Obtient la valeur de la propriété rank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name="rank")
    public String getRank() {
        return rank;
    }

    /**
     * Définit la valeur de la propriété rank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Obtient la valeur de la propriété noPasses.
     * 
     */
    @XmlElement(name="nopasses")
    public boolean isNoPasses() {
        return noPasses;
    }

    /**
     * Définit la valeur de la propriété noPasses.
     * 
     */
    public void setNoPasses(boolean value) {
        this.noPasses = value;
    }

    /**
     * Gets the value of the actors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @XmlElement(name="actors")
    public List<String> getActors() {
        if (actors == null) {
            actors = new ArrayList<String>();
        }
        return this.actors;
    }

    /**
     * Gets the value of the directors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @XmlElement(name="directors")
    public List<String> getDirectors() {
        if (directors == null) {
            directors = new ArrayList<String>();
        }
        return this.directors;
    }

    /**
     * Gets the value of the producers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @XmlElement(name="producers")
    public List<String> getProducers() {
        if (producers == null) {
            producers = new ArrayList<String>();
        }
        return this.producers;
    }

    /**
     * Gets the value of the writers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @XmlElement(name="writers")
    public List<String> getWriters() {
        if (writers == null) {
            writers = new ArrayList<String>();
        }
        return this.writers;
    }

    /**
     * Gets the value of the studios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @XmlElement(name="studios")
    public List<String> getStudios() {
        if (studios == null) {
            studios = new ArrayList<>();
        }
        return this.studios;
    }

}
