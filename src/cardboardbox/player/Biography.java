/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import java.io.Serializable;

/**
 *
 * @author egand
 */
public class Biography implements Serializable{

    private String name;
    private int age;
    private String job;
    private String race;
    private double height;
    private double weight;
    private String morality;

    public Biography() {
    }
    public void importChar(String name, int age, String job, String race, double height, double weight, String morality){
        this.height = height;
        this.weight = weight;
        this.name=name;
        this.age=age;
        this.job=job;
        this.race=race;
        this.morality=morality;       
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the morality
     */
    public String getMorality() {
        return morality;
    }

    /**
     * @param morality the morality to set
     */
    public void setMorality(String morality) {
        this.morality = morality;
    }
    /*
    * Clears the biography
    */
    public Biography clear(){
        return new Biography();
    }
    /*
    * used to load a saved biography. 
    */
    //returns the Biography to be parsed and saved
    public Biography saveBiography(){
        return this;
    }
}
