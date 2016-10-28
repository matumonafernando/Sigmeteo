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
public class form_hourly_time_selection {
  private int hh;
  private int hh_selection;

    public form_hourly_time_selection(int hh, int hh_selection) {
        this.hh = hh;
        this.hh_selection = hh_selection;
    }
  
    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getHh_selection() {
        return hh_selection;
    }

    public void setHh_selection(int hh_selection) {
        this.hh_selection = hh_selection;
    }
  
  
}
