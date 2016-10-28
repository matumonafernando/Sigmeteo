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
public class data_forms {
 private int id;
 private int order_num; 
 private String table_name;
 private String form_name;
 private double description;
 private float selected;
 private int val_start_position;
private int val_end_position;
private String elem_code_location;
private String sequencer;

    public data_forms(int id, int order_num, String table_name, String form_name, double description, float selected, int val_start_position, int val_end_position, String elem_code_location, String sequencer) {
        this.id = id;
        this.order_num = order_num;
        this.table_name = table_name;
        this.form_name = form_name;
        this.description = description;
        this.selected = selected;
        this.val_start_position = val_start_position;
        this.val_end_position = val_end_position;
        this.elem_code_location = elem_code_location;
        this.sequencer = sequencer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_num() {
        return order_num;
    }

    public void setOrder_num(int order_num) {
        this.order_num = order_num;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public float getSelected() {
        return selected;
    }

    public void setSelected(float selected) {
        this.selected = selected;
    }

    public int getVal_start_position() {
        return val_start_position;
    }

    public void setVal_start_position(int val_start_position) {
        this.val_start_position = val_start_position;
    }

    public int getVal_end_position() {
        return val_end_position;
    }

    public void setVal_end_position(int val_end_position) {
        this.val_end_position = val_end_position;
    }

    public String getElem_code_location() {
        return elem_code_location;
    }

    public void setElem_code_location(String elem_code_location) {
        this.elem_code_location = elem_code_location;
    }

    public String getSequencer() {
        return sequencer;
    }

    public void setSequencer(String sequencer) {
        this.sequencer = sequencer;
    }

}
