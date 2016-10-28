/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author INAMETCLIN-3
 */
public class flags {
   private String charecterSymbolo;
   private int numSymbol;
   private String description;

    public flags(String charecterSymbolo, int numSymbol, String description) {
        this.charecterSymbolo = charecterSymbolo;
        this.numSymbol = numSymbol;
        this.description = description;
    }

    public String getCharecterSymbolo() {
        return charecterSymbolo;
    }

    public void setCharecterSymbolo(String charecterSymbolo) {
        this.charecterSymbolo = charecterSymbolo;
    }

    public int getNumSymbol() {
        return numSymbol;
    }

    public void setNumSymbol(int numSymbol) {
        this.numSymbol = numSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
}
