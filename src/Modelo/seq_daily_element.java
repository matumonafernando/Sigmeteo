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
public class seq_daily_element {
    private int seq;
    private int elementId;

    public seq_daily_element(int seq, int elementId) {
        this.seq = seq;
        this.elementId = elementId;
    }

    public seq_daily_element(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }
    
}
