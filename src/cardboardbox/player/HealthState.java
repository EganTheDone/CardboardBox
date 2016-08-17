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
public class HealthState implements Serializable{
    private int playerHealth;
    private int playerWill;
    private String status;

    public HealthState(int health, int will){
        this.playerHealth = health;
        this.playerWill = will;
        this.status="alive";
    }

    public void takeDamage(int dmg){
        if(dmg==this.playerHealth){
            this.status = "dead";
        }
        this.playerHealth-=dmg;
    }
    public void heal(int hl){
        if(this.status.equals("dead")){
            this.status="alive";
            this.playerHealth=0;
        }
        this.playerHealth+=hl;
    }
    public void willDamage(int dmg){
        this.playerWill-=dmg;
        if(this.playerWill<0){
            int hdmg = this.playerWill;
            this.playerWill=0;
            takeDamage(hdmg);
        }
    }
    public String getStatus(){
        return this.status;
    }

    /**
     * @return the playerHealth
     */
    public int getPlayerHealth() {
        return playerHealth;
    }

    /**
     * @param playerHealth the playerHealth to set
     */
    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    /**
     * @return the playerWill
     */
    public int getPlayerWill() {
        return playerWill;
    }

    /**
     * @param playerWill the playerWill to set
     */
    public void setPlayerWill(int playerWill) {
        this.playerWill = playerWill;
    }

}
