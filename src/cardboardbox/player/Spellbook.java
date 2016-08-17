/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author egand
 */
public class Spellbook implements Serializable{
    private ArrayList<Spell> physical;
    private int numPhys;
    private ArrayList<Spell> magic;
    private int numMagic;
    public Spellbook(){
        this.numPhys = 0;
        this.numMagic = 0;
    }
    public Spellbook(ArrayList<Spell> phys, ArrayList<Spell> magical){
        this.physical = phys;
        this.magic = magical;
        this.numPhys = phys.size();
        this.numMagic = magical.size();
    }
    public ArrayList<Spell> getPhysical(){
        return this.physical;
    }
    public int getNumPhys(){
        return this.numPhys;
    }
    public ArrayList<Spell> getMagic(){
        return this.magic;
    }
    public int getNumMagic(){
        return this.numMagic;
    }

    public void removePhysical(Spell name){
        if(this.physical.contains(name)){
            this.physical.remove(name);
            this.numPhys--;
        }
    }
    public void removeMagic(Spell name){
        if(this.magic.contains(name)){
            this.magic.remove(name);
            this.numMagic--;
        }
    }

    public void addPhysical(Spell spell){
        if(!(this.physical.contains(spell))){
            this.physical.add(spell);
            this.numPhys++;
        }
    }
    public void addMagic(Spell spell){
        if(!(this.magic.contains(spell))){
            this.magic.add(spell);
            this.numMagic++;
        }
    }
    public void clearPhysical(){
        this.physical.clear();
        this.numPhys=0;
    }
    public void clearMagic(){
        this.magic.clear();
        this.numMagic=0;
    }

    
}
