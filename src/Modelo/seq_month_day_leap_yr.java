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
public class seq_month_day_leap_yr {
    private int mm;
    private int dd;

    public seq_month_day_leap_yr(int mm, int dd) {
        this.mm = mm;
        this.dd = dd;
    }

    
    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }
    
}
