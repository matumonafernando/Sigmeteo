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
public class feauturegeographicalposition {
    private String belongsTo;
    private int observedOn;
    private double latitude;
    private double longitude;

    public feauturegeographicalposition(String belongsTo, int observedOn, double latitude, double longitude) {
        this.belongsTo = belongsTo;
        this.observedOn = observedOn;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    public int getObservedOn() {
        return observedOn;
    }

    public void setObservedOn(int observedOn) {
        this.observedOn = observedOn;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
}
