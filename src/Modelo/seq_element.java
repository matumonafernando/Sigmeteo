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
public class seq_element {
    private int seq;
    private String element_code;

    public seq_element(int seq, String element_code) {
        this.seq = seq;
        this.element_code = element_code;
    }

    
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getElement_code() {
        return element_code;
    }

    public void setElement_code(String element_code) {
        this.element_code = element_code;
    }
    
}
